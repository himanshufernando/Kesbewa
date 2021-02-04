package tkhub.project.kesbewa.repo

import  android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.util.Log
import com.google.firebase.database.*
import kotlinx.coroutines.cancel
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import tkhub.orderject.kesbewa.data.model.Password
import tkhub.project.kesbewa.Kesbewa
import tkhub.project.kesbewa.data.model.User
import tkhub.project.kesbewa.data.model.NetworkError
import tkhub.project.kesbewa.data.model.VersionRespons
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.services.network.InternetConnection
import java.util.*
import javax.inject.Singleton
import kotlin.collections.ArrayList

@Singleton
class RegisterRepo(context: Context) {



    var mContext = context

    var database: FirebaseDatabase? = FirebaseDatabase.getInstance()
    var userRef: DatabaseReference? = database?.getReference("User")
    var versionRef = database?.getReference("VersionControl")
    var passwordRef = database?.getReference("Password_Reset")

    var appPref = AppPrefs

    var databaseEmptyRef = database?.reference


    suspend fun checkVersionMatch(): Flow<VersionRespons?> = callbackFlow {

        versionRef?.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val post = dataSnapshot.getValue(VersionRespons::class.java)
                var versionCode = 0L
                try {
                    val pInfo = mContext.packageManager.getPackageInfo(mContext.packageName, 0)
                    versionCode = if (Build.VERSION.SDK_INT >= 28) {
                        pInfo.longVersionCode
                    } else {
                        pInfo.versionCode.toLong()
                    }
                } catch (e: PackageManager.NameNotFoundException) {
                    e.printStackTrace()
                }
                var serverVersion = post?.version_code
                if (serverVersion != null) {
                    post?.is_version_validate = serverVersion <= versionCode
                }
                offer(post)

            }

            override fun onCancelled(error: DatabaseError) {
                return
            }
        })

        awaitClose { this.cancel() }
    }


    suspend fun saveUser(user: User): Flow<NetworkError> = callbackFlow {

        var finalUser = user
        userRef?.keepSynced(false)
        var errorSaveUser = NetworkError()


        when {
            (AppPrefs.checkValidString(finalUser.user_name!!)) -> {
                errorSaveUser.errorMessage = "Enter your name !"
                errorSaveUser.errorCode = appPref.ERROR_USER_NAME_EMPTY
                offer(errorSaveUser)
            }
            (finalUser.user_name!!.length < 4) -> {
                errorSaveUser.errorMessage = "Username must have more than 4 characters"
                errorSaveUser.errorCode = appPref.ERROR_USERNAME_CHARACTERS_VIOLATION
                offer(errorSaveUser)
            }
            (AppPrefs.checkValidString(finalUser.user_phone!!)) -> {
                errorSaveUser.errorMessage = "Enter your phone number !"
                errorSaveUser.errorCode = appPref.ERROR_PHONE_NUMBER_EMPTY
                offer(errorSaveUser)
            }
            finalUser.user_phone!!.length != 10 -> {
                errorSaveUser.errorMessage = "Enter valid phone number !"
                errorSaveUser.errorCode = appPref.ERROR_PHONE_NUMBER_EMPTY
                offer(errorSaveUser)
            }
            (AppPrefs.checkValidString(finalUser.user_email!!)) -> {
                errorSaveUser.errorMessage = "Enter your email address !"
                errorSaveUser.errorCode = appPref.ERROR_EMAIL_EMPTY
                offer(errorSaveUser)
            }
            !AppPrefs.validateEmailAddress(finalUser.user_email!!) -> {
                errorSaveUser.errorMessage = "Enter valid email address !"
                errorSaveUser.errorCode = appPref.ERROR_EMAIL_EMPTY
                offer(errorSaveUser)
            }

            (AppPrefs.checkValidString(finalUser.user_login!!)) -> {
                errorSaveUser.errorMessage = "Enter your password !"
                errorSaveUser.errorCode = appPref.ERROR_PASSWORD_EMPTY
                offer(errorSaveUser)
            }
            (finalUser.user_login!!.length < 6) -> {
                errorSaveUser.errorMessage = "Please enter at least 6 characters  !"
                errorSaveUser.errorCode = appPref.ERROR_PASSWORD_INVALID
                offer(errorSaveUser)
            }
            (finalUser.user_login!! != finalUser.user_confirm_password) -> {
                errorSaveUser.errorMessage = "Your password and confirmation password do not match. !"
                errorSaveUser.errorCode = appPref.ERROR_PASSWORD_NOT_MATCH
                offer(errorSaveUser)
            }
            (!InternetConnection.checkInternetConnection()) -> {
                offer(appPref.errorNoInternet())
            }
            else -> {

                val query: Query =
                    userRef?.orderByChild("user_phone")!!.equalTo(finalUser.user_phone)

                query.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.childrenCount == 0L) {
                            var pushid =
                                AppPrefs.getStringKeyValuePrefs(mContext, AppPrefs.KEY_PUSH_TOKEN)
                            var encryptedPrivateKeyInfo =
                                AppPrefs.encrypPassword(finalUser.user_phone + finalUser.user_login)

                            finalUser.user_login = encryptedPrivateKeyInfo
                            finalUser.push_id = pushid
                            finalUser.user_confirm_password = ""


                            var unxId = genarateUniqCode()
                            finalUser.user_id = unxId.toString()
                            finalUser.user_google = true
                            userRef?.child(unxId.toString())?.setValue(finalUser)

                            AppPrefs.setUserPrefs(mContext, AppPrefs.KEY_USER, finalUser)
                            errorSaveUser.errorMessage = "Welcome " + finalUser.user_name
                            errorSaveUser.errorCode = appPref.SUCCESS_USER_SAVE
                            offer(errorSaveUser)

                        } else {
                            errorSaveUser.errorMessage =
                                "You have account for this mobile number please login !"
                            errorSaveUser.errorCode = AppPrefs.ERROR_ACCOUNT_ALREADY_EXISTS
                            offer(errorSaveUser)
                            return
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        offer(appPref.errorSomethingWentWrong())
                    }
                })


            }
        }

        awaitClose { this.cancel() }
    }

    fun genarateUniqCode(): Long {
        val c: Calendar = Calendar.getInstance()
        var numberFromTime =
            c.get(Calendar.DATE).toString() +
                    c.get(Calendar.HOUR).toString() +
                    c.get(Calendar.MINUTE).toString() +
                    c.get(Calendar.SECOND).toString() +
                    c.get(Calendar.MILLISECOND).toString() + ((1..100000).random()).toString()

        return numberFromTime.toLong()
    }

    suspend fun createUserCode(user: User): Flow<User> = callbackFlow {

        var finalUser = user
        userRef?.keepSynced(false)


        userRef?.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                val value = dataSnapshot.childrenCount
                var nameCode = ""
                nameCode = if (finalUser.user_name!!.length < 4) {
                    user.user_name?.subSequence(0, finalUser.user_name!!.length).toString()
                        .toUpperCase()
                } else {
                    user.user_name?.subSequence(0, 3).toString().toUpperCase()
                }


                nameCode += "$value-"
                nameCode += (1..1000).random().toString()
                finalUser.user_code = nameCode

                offer(finalUser)

            }

            override fun onCancelled(error: DatabaseError) {
                finalUser.user_code = genarateUniqCode().toString()
                offer(finalUser)
            }
        })

        awaitClose { this.cancel() }
    }


    suspend fun loginUser(user: User): Flow<NetworkError> = callbackFlow {
        userRef?.keepSynced(false)
        var errorLogin = NetworkError()
        Log.i("Himanshu","loginUser")

        when {
            (AppPrefs.checkValidString(user.user_phone!!)) -> {
                errorLogin.errorMessage = "Enter your phone number !"
                errorLogin.errorCode = "PN"
                offer(errorLogin)
            }
            user.user_phone!!.length != 10 -> {
                errorLogin.errorMessage = "Enter valid phone number !"
                errorLogin.errorCode = "PN"
                offer(errorLogin)
            }
            (AppPrefs.checkValidString(user.user_login!!)) -> {
                errorLogin.errorMessage = "Enter your password !"
                errorLogin.errorCode = "PW"
                offer(errorLogin)
            }
            (user.user_login!!.length < 6) -> {
                errorLogin.errorMessage = "Please enter at least 6 characters  !"
                errorLogin.errorCode = "PW"
                offer(errorLogin)

            }
            (!InternetConnection.checkInternetConnection()) -> {
                errorLogin.errorMessage =
                    "No internet access please check your connection and retry !"
                errorLogin.errorCode = "IC"
                offer(errorLogin)
            }
            else -> {

                var pushid = AppPrefs.getStringKeyValuePrefs(mContext, AppPrefs.KEY_PUSH_TOKEN)
                var encryptedPrivateKeyInfo =
                    AppPrefs.encrypPassword(user.user_phone!! + user.user_login!!)

                val query: Query =
                    userRef?.orderByChild("user_login")!!.equalTo(encryptedPrivateKeyInfo)
                query.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.childrenCount == 0L) {
                            errorLogin.errorMessage =
                                "Incorrect login, please check your phone number or password !"
                            errorLogin.errorCode = appPref.ERROR_INCORRECT_LOGIN
                            offer(errorLogin)
                        } else {

                             lateinit var logUser: User
                            dataSnapshot.children.forEach {it
                                logUser = it.getValue(User::class.java)!!

                                logUser.push_id = pushid
                                AppPrefs.setUserPrefs(mContext, AppPrefs.KEY_USER, logUser)
                            }

                            if (logUser.user_name.isNullOrEmpty()) {
                                offer(appPref.errorSomethingWentWrong())
                                return
                            } else {
                                databaseEmptyRef!!.child("User").child(logUser.user_id!!)
                                    .child("push_id").setValue(pushid)

                                errorLogin.errorMessage = "You are successfully logged in !"
                                errorLogin.errorCode = appPref.SUCCESS_LOGGING
                                offer(errorLogin)
                                return
                            }
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                      //  println("ssssssssssssssssssssss error "+error)
                       offer(appPref.errorSomethingWentWrong())

                    }
                })

            }

        }

        awaitClose { this.cancel() }
    }

    suspend fun updateUser(user: User): Flow<NetworkError> = callbackFlow {

        var finalUser = user
        userRef?.keepSynced(false)
        var errorSaveUser = NetworkError()


        when {
            (AppPrefs.checkValidString(finalUser.user_name!!)) -> {
                errorSaveUser.errorMessage = "Enter your name !"
                errorSaveUser.errorCode = appPref.ERROR_USER_NAME_EMPTY
                offer(errorSaveUser)
            }
            (finalUser.user_name!!.length < 4) -> {
                errorSaveUser.errorMessage = "Username must have more than 4 characters"
                errorSaveUser.errorCode = appPref.ERROR_USERNAME_CHARACTERS_VIOLATION
                offer(errorSaveUser)
            }
            (AppPrefs.checkValidString(finalUser.user_email!!)) -> {
                errorSaveUser.errorMessage = "Enter your email address !"
                errorSaveUser.errorCode = appPref.ERROR_EMAIL_EMPTY
                offer(errorSaveUser)
            }
            !AppPrefs.validateEmailAddress(finalUser.user_email!!) -> {
                errorSaveUser.errorMessage = "Enter valid email address !"
                errorSaveUser.errorCode = appPref.ERROR_EMAIL_EMPTY
                offer(errorSaveUser)
            }
            (AppPrefs.checkValidString(finalUser.user_nic!!)) -> {
                errorSaveUser.errorMessage = "Enter your NIC !"
                errorSaveUser.errorCode = appPref.ERROR_NIC_EMPTY
                offer(errorSaveUser)
            }
            !AppPrefs.validateNIC(finalUser.user_nic!!) -> {
                errorSaveUser.errorMessage = "Enter valid NIC !"
                errorSaveUser.errorCode = appPref.ERROR_NIC_EMPTY
                offer(errorSaveUser)
            }
            (!InternetConnection.checkInternetConnection()) -> {
                offer(appPref.errorNoInternet())
            }
            else -> {
                userRef?.child(finalUser.user_id.toString())?.child("user_name")
                    ?.setValue(finalUser.user_name)
                userRef?.child(finalUser.user_id.toString())?.child("user_nic")
                    ?.setValue(finalUser.user_nic)
                userRef?.child(finalUser.user_id.toString())?.child("user_email")
                    ?.setValue(finalUser.user_email)

                val query: Query =
                    userRef?.orderByChild("user_id")!!.equalTo(finalUser.user_id.toString())
                query.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        lateinit var logUser: User
                        dataSnapshot.children.forEach {it
                            logUser = it.getValue(User::class.java)!!
                            AppPrefs.setUserPrefs(mContext, AppPrefs.KEY_USER, logUser)
                        }

                        errorSaveUser.errorMessage = "Update successfully"
                        errorSaveUser.errorCode = appPref.SUCCESS_USER_UPDATE
                        offer(errorSaveUser)
                    }

                    override fun onCancelled(error: DatabaseError) {
                        offer(appPref.errorSomethingWentWrong())
                    }
                })


            }
        }

        awaitClose { this.cancel() }
    }


    suspend fun saveGoogleUser(user: User): Flow<NetworkError> = callbackFlow {

        var finalUser = user
        userRef?.keepSynced(false)
        var errorSaveUser = NetworkError()


        when {
            (AppPrefs.checkValidString(finalUser.user_name!!)) -> {
                errorSaveUser.errorMessage = "Enter your name !"
                errorSaveUser.errorCode = appPref.ERROR_USER_NAME_EMPTY
                offer(errorSaveUser)
            }
            (finalUser.user_name!!.length < 4) -> {
                errorSaveUser.errorMessage = "Username must have more than 4 characters"
                errorSaveUser.errorCode = appPref.ERROR_USERNAME_CHARACTERS_VIOLATION
                offer(errorSaveUser)
            }
            (AppPrefs.checkValidString(finalUser.user_phone!!)) -> {
                errorSaveUser.errorMessage = "Enter your phone number !"
                errorSaveUser.errorCode = appPref.ERROR_PHONE_NUMBER_EMPTY
                offer(errorSaveUser)
            }
            finalUser.user_phone!!.length != 10 -> {
                errorSaveUser.errorMessage = "Enter valid phone number !"
                errorSaveUser.errorCode = appPref.ERROR_PHONE_NUMBER_EMPTY
                offer(errorSaveUser)
            }
            (AppPrefs.checkValidString(finalUser.user_email!!)) -> {
                errorSaveUser.errorMessage = "Enter your email address !"
                errorSaveUser.errorCode = appPref.ERROR_EMAIL_EMPTY
                offer(errorSaveUser)
            }
            !AppPrefs.validateEmailAddress(finalUser.user_email!!) -> {
                errorSaveUser.errorMessage = "Enter valid email address !"
                errorSaveUser.errorCode = appPref.ERROR_EMAIL_EMPTY
                offer(errorSaveUser)
            }
            (AppPrefs.checkValidString(finalUser.user_nic!!)) -> {
                errorSaveUser.errorMessage = "Enter your NIC !"
                errorSaveUser.errorCode = appPref.ERROR_NIC_EMPTY
                offer(errorSaveUser)
            }
            !AppPrefs.validateNIC(finalUser.user_nic!!) -> {
                errorSaveUser.errorMessage = "Enter valid NIC !"
                errorSaveUser.errorCode = appPref.ERROR_NIC_EMPTY
                offer(errorSaveUser)
            }

            (!InternetConnection.checkInternetConnection()) -> {
                offer(appPref.errorNoInternet())
            }
            else -> {

                val query: Query =
                    userRef?.orderByChild("user_phone")!!.equalTo(finalUser.user_phone)
                query.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.childrenCount == 0L) {
                            var pushid =
                                AppPrefs.getStringKeyValuePrefs(
                                    Kesbewa.applicationContext(),
                                    AppPrefs.KEY_PUSH_TOKEN
                                )
                            finalUser.push_id = pushid


                            finalUser.user_id = user.user_id
                            finalUser.user_google_id = user.user_google_id
                            finalUser.user_google = true


                            userRef?.child(user.user_id.toString())?.setValue(finalUser)

                            AppPrefs.setUserPrefs(mContext, AppPrefs.KEY_USER, finalUser)
                            errorSaveUser.errorMessage = "Welcome " + finalUser.user_name
                            errorSaveUser.errorCode = appPref.SUCCESS_USER_SAVE
                            offer(errorSaveUser)

                        } else {
                            errorSaveUser.errorMessage =
                                "You have account for this mobile number please login !"
                            errorSaveUser.errorCode = AppPrefs.ERROR_ACCOUNT_ALREADY_EXISTS
                            offer(errorSaveUser)
                            return
                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        offer(appPref.errorSomethingWentWrong())
                    }
                })

            }
        }

        awaitClose { this.cancel() }
    }


    suspend fun passwordResetCode(number: String): Flow<NetworkError> = callbackFlow {
        var errorSaveUser = NetworkError()
        when {
            (AppPrefs.checkValidString(number)) -> {
                errorSaveUser.errorMessage = "Enter your phone number !"
                errorSaveUser.errorCode = appPref.ERROR_PHONE_NUMBER_EMPTY
                offer(errorSaveUser)

            }
            number.length != 10 -> {
                errorSaveUser.errorMessage = "Enter valid phone number !"
                errorSaveUser.errorCode = appPref.ERROR_PHONE_NUMBER_EMPTY
                offer(errorSaveUser)

            }
            (!InternetConnection.checkInternetConnection()) -> {
                offer(appPref.errorNoInternet())

            }
            else -> {
                val query: Query = userRef?.orderByChild("user_phone")!!.equalTo(number)
                query.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.childrenCount == 0L) {
                            errorSaveUser.errorMessage = "No account to this phone number, Please try again !"
                            errorSaveUser.errorCode = appPref.ERROR_NO_ACCOUNT
                            offer(errorSaveUser)

                        } else {
                            lateinit var resetuser: User
                            dataSnapshot.children.forEach {it
                                resetuser = it.getValue(User::class.java)!!
                            }

                            if(resetuser.user_google){
                                errorSaveUser.errorMessage = "You are sign using google sign in, Please user Google Sign In to loging !"
                                errorSaveUser.errorCode = AppPrefs.ERROR_SIGN_USING_GOOGLE
                                offer(errorSaveUser)

                            }else{
                                var password = Password().apply {
                                    code_id = genarateUniqCode().toString()
                                    phone = number
                                    user = resetuser.user_id.toString()
                                    user_email= resetuser.user_email.toString()
                                    user_phone = resetuser.user_phone.toString()
                                }
                                passwordRef?.child(password.code_id)
                                    ?.setValue(password)

                                errorSaveUser.errorMessage = "We have sent password reset code to your email address"
                                errorSaveUser.errorCode = AppPrefs.SUCCESS_PASSWORD_RESET_CODE
                                errorSaveUser.errorData = resetuser.user_id.toString()
                                offer(errorSaveUser)

                            }

                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        offer(appPref.errorSomethingWentWrong())
                    }
                })

            }
        }

        awaitClose { this.cancel() }
    }

    suspend fun passwordReset(user: User): Flow<NetworkError> = callbackFlow {
        var errorSaveUser = NetworkError()
        when {
            (AppPrefs.checkValidString(user.user_code!!)) -> {
                errorSaveUser.errorMessage = "Enter reset code received to your email !"
                errorSaveUser.errorCode = appPref.ERROR_EMPTY_PASSWORD_RESET_CODE
                offer(errorSaveUser)
            }

            (AppPrefs.checkValidString(user.user_login!!)) -> {
                errorSaveUser.errorMessage = "Enter your password !"
                errorSaveUser.errorCode = appPref.ERROR_PASSWORD_EMPTY
                offer(errorSaveUser)
            }
           /* (user.user_login!!.length < 6) -> {
                errorSaveUser.errorMessage = "Please enter at least 6 characters  !"
                errorSaveUser.errorCode = appPref.ERROR_PASSWORD_INVALID
                offer(errorSaveUser)
            }*/
            (user.user_login!! != user.user_confirm_password) -> {
                errorSaveUser.errorMessage = "Your password and confirmation password do not match. !"
                errorSaveUser.errorCode = appPref.ERROR_PASSWORD_NOT_MATCH
                offer(errorSaveUser)
            }

            (!InternetConnection.checkInternetConnection()) -> {
                offer(appPref.errorNoInternet())

            }
            else -> {

                val query: Query = passwordRef?.orderByChild("user")!!.equalTo(user.user_id)
                query.addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.childrenCount == 0L) {
                            errorSaveUser.errorMessage = "We haven't received password reset request, Please try again !"
                            errorSaveUser.errorCode = appPref.ERROR_NOT_RECEIVED_PASSWORD_RESET_REQUESTED
                            offer(errorSaveUser)

                        } else {
                            var codeList = ArrayList<Password>()
                            lateinit var password: Password
                            dataSnapshot.children.forEach {it
                                password = it.getValue(Password::class.java)!!
                                codeList.add(password)
                            }

                            var sort = codeList.sortBy { it.date}

                            if(codeList.last().code.toString() == user.user_code.toString()){
                                if(codeList.last().code_exp){
                                    errorSaveUser.errorMessage = "Your password reset code has expired, Please retry !"
                                    errorSaveUser.errorCode = appPref.ERROR_PASSWORD_RESET_CODE_EXPIRED
                                    offer(errorSaveUser)
                                }else{
                                    var encryptedPrivateKeyInfo =
                                        AppPrefs.encrypPassword(password.user_phone + user.user_login)

                                    userRef?.child(user.user_id.toString())?.child("user_login")
                                        ?.setValue(encryptedPrivateKeyInfo)
                                    errorSaveUser.errorMessage = "Password reset successfully, Please login !"
                                    errorSaveUser.errorCode = appPref.SUCCESS_PASSWORD_RESET
                                    offer(errorSaveUser)
                                }

                            }else{
                                errorSaveUser.errorMessage = "Invalid reset code, Please try again !"
                                errorSaveUser.errorCode = appPref.ERROR_INVALID_RESET_CODE
                                offer(errorSaveUser)
                            }

                        }
                    }

                    override fun onCancelled(error: DatabaseError) {
                        offer(appPref.errorSomethingWentWrong())
                    }
                })

            }
        }

        awaitClose { this.cancel() }
    }

}