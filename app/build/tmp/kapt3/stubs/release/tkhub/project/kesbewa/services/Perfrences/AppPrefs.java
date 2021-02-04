package tkhub.project.kesbewa.services.Perfrences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bB\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\u0004J\u000e\u0010I\u001a\u00020\u00042\u0006\u0010J\u001a\u00020\u0004J\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020LJ\u000e\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020\u0004J\u0006\u0010P\u001a\u00020\u0004J\u0016\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XJ\u0016\u0010Y\u001a\u00020Z2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u0004J\u0016\u0010[\u001a\u00020\\2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u0004J\u0016\u0010]\u001a\u00020^2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010_\u001a\u00020`2\u0006\u0010W\u001a\u00020XJ\u000e\u0010a\u001a\u00020G2\u0006\u0010W\u001a\u00020XJ\u0016\u0010b\u001a\u00020c2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u0004J\u0016\u0010d\u001a\u00020e2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010f\u001a\u00020Z2\u0006\u0010W\u001a\u00020XJ\u0016\u0010g\u001a\u00020\u00042\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u0004J\u0016\u0010h\u001a\u00020i2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u0004J\u0016\u0010j\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010l\u001a\u00020VJ\u001e\u0010m\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010l\u001a\u00020ZJ\u001e\u0010n\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010l\u001a\u00020\\J\u001e\u0010o\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010l\u001a\u00020^J\u0016\u0010p\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010l\u001a\u00020`J\u001e\u0010q\u001a\u00020k2\u0006\u0010S\u001a\u00020T2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010l\u001a\u00020RJ\u0016\u0010r\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010s\u001a\u00020GJ\u001e\u0010t\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010l\u001a\u00020cJ\u001e\u0010u\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010l\u001a\u00020eJ\u0016\u0010v\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010l\u001a\u00020ZJ\u001e\u0010w\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010l\u001a\u00020\u0004J\u001e\u0010x\u001a\u00020k2\u0006\u0010W\u001a\u00020X2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010l\u001a\u00020iJ\u000e\u0010y\u001a\u00020G2\u0006\u0010z\u001a\u00020\u0004J\u000e\u0010{\u001a\u00020G2\u0006\u0010|\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006}"}, d2 = {"Ltkhub/project/kesbewa/services/Perfrences/AppPrefs;", "", "()V", "ERROR_ACCOUNT_ALREADY_EXISTS", "", "ERROR_DISABLE_DELIVERY", "ERROR_DISABLE_PICKUP", "ERROR_EMAIL_EMPTY", "ERROR_EMPTY_ADDRESS", "ERROR_EMPTY_ADDRESS_NUMBER", "ERROR_EMPTY_CART", "ERROR_EMPTY_CITY", "ERROR_EMPTY_CITYLIST", "ERROR_EMPTY_DISPATCH_TYPE", "ERROR_EMPTY_DISTRICT", "ERROR_EMPTY_LOCATION", "ERROR_EMPTY_PASSWORD_RESET_CODE", "ERROR_EMPTY_PROMOCODE", "ERROR_EMPTY_STORE_LOCATION", "ERROR_EMPTY_STREET_ADDRESS", "ERROR_EMPTY_ZIP_CODE", "ERROR_INCORRECT_LOGIN", "ERROR_INTERNET", "ERROR_INVALID_RESET_CODE", "ERROR_INVALID_ZIP_CODE", "ERROR_MANUALLY_LOGGED", "ERROR_NIC_EMPTY", "ERROR_NOT_RECEIVED_PASSWORD_RESET_REQUESTED", "ERROR_NO_ACCOUNT", "ERROR_ORDER_NOT_SUCCESSFULLY", "ERROR_PASSWORD_EMPTY", "ERROR_PASSWORD_INVALID", "ERROR_PASSWORD_NOT_MATCH", "ERROR_PASSWORD_RESET_CODE_EXPIRED", "ERROR_PHONE_NUMBER_EMPTY", "ERROR_PROMOCODE_INVALID", "ERROR_SIGN_USING_GOOGLE", "ERROR_SOMETHING_WENT_WRONG", "ERROR_USERNAME_CHARACTERS_VIOLATION", "ERROR_USER_NAME_EMPTY", "KEY_ADDTOCARTACTIONSTATUS", "KEY_CURRENT_LOCATION", "KEY_DELIVERY_CHARGES", "KEY_DISPATCH_COLOMBO", "KEY_DISPATCH_DELIVERY", "KEY_DISPATCH_KADAWATHA", "KEY_DISPATCH_NEGOMBO", "KEY_DISPATCH_STORE", "KEY_FRAGMENT_ID", "KEY_GUEST_USER", "KEY_MANUAL_LOCATION", "KEY_ORDER", "KEY_ORDER_CONFIG", "KEY_PUSH_TOKEN", "KEY_PUSH_TOKEN_PUBLISH", "KEY_SELECTED_PROMO", "KEY_SELECTED_USER_ADDERSS", "KEY_SHOWCASE", "KEY_SPLASH_STATUS", "KEY_USER", "PREFNAME", "SUCCESS_ADDRESS_SAVE_SUCCESSFULLY", "SUCCESS_LOGGING", "SUCCESS_ORDER_SUCCESSFULLY", "SUCCESS_PASSWORD_RESET", "SUCCESS_PASSWORD_RESET_CODE", "SUCCESS_PROMOCODE_VALID", "SUCCESS_USER_SAVE", "SUCCESS_USER_UPDATE", "SUCCESS_VERIFY_GOOGLE", "checkValidString", "", "st", "encrypPassword", "key", "errorNoInternet", "Ltkhub/project/kesbewa/data/model/NetworkError;", "errorSomethingWentWrong", "genarateUniqOrderCode", "code", "getAndroidid", "getCartValuePrefs", "Ltkhub/orderject/kesbewa/data/model/Order;", "activity", "Landroid/app/Activity;", "getDeliveryChargesPrefs", "", "ctx", "Landroid/content/Context;", "getIntKeyValuePrefs", "", "getLocationKeyValuePrefs", "Ltkhub/project/kesbewa/data/model/CurrentLocation;", "getLocationMaunalKeyValuePrefs", "Ltkhub/project/kesbewa/data/model/ManualLocation;", "getOrderConfigPrefs", "Ltkhub/project/kesbewa/data/model/OrderConfigLog;", "getPushTokenPublishPrefs", "getSelectAdressMaunalKeyValuePrefs", "Ltkhub/project/kesbewa/data/model/DeliveryAddress;", "getSelectPromoKeyValuePrefs", "Ltkhub/project/kesbewa/data/model/PromoCode;", "getShowCaseVisibilityPrefs", "getStringKeyValuePrefs", "getUserPrefs", "Ltkhub/project/kesbewa/data/model/User;", "setDeliveryChargesPrefs", "", "value", "setIntKeyValuePrefs", "setLocationKeyValuePrefs", "setLocationManualKeyValuePrefs", "setOrderConfigPrefs", "setOrderValuePrefs", "setPushTokenPublishPrefs", "status", "setSelectAdressManualKeyValuePrefs", "setSelectPromoKeyValuePrefs", "setShowCaseVisibilityPrefs", "setStringKeyValuePrefs", "setUserPrefs", "validateEmailAddress", "email", "validateNIC", "nic", "app_release"})
public final class AppPrefs {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFNAME = "kesbewapref";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SHOWCASE = "showcase";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SPLASH_STATUS = "splash_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ORDER = "order_details";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ADDTOCARTACTIONSTATUS = "add_to_cat_status";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_FRAGMENT_ID = "fragment_id";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PUSH_TOKEN = "push_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_CURRENT_LOCATION = "current_location";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_MANUAL_LOCATION = "manual_location";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SELECTED_USER_ADDERSS = "selected_user_address";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_SELECTED_PROMO = "selected_promo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER = "user";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_GUEST_USER = "guest_user";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DELIVERY_CHARGES = "delivery_charges";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DISPATCH_STORE = "STORE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DISPATCH_DELIVERY = "DELIVERY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DISPATCH_NEGOMBO = "NEGOMBO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DISPATCH_KADAWATHA = "KADAWATHA";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_DISPATCH_COLOMBO = "COLOMBO";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_PUSH_TOKEN_PUBLISH = "Push_token_publish";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ORDER_CONFIG = "Order_Config";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_USER_NAME_EMPTY = "UE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_PHONE_NUMBER_EMPTY = "PE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMAIL_EMPTY = "EE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_NIC_EMPTY = "NICE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_PASSWORD_EMPTY = "PWE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_PASSWORD_INVALID = "PWI";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_PASSWORD_NOT_MATCH = "PWNM";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_INTERNET = "IC";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_SOMETHING_WENT_WRONG = "SW";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_ACCOUNT_ALREADY_EXISTS = "AAE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_INCORRECT_LOGIN = "LOGGEDFAIL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_CART = "EC";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_ADDRESS = "EA";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_ORDER_NOT_SUCCESSFULLY = "OE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_ADDRESS_NUMBER = "EAN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_LOCATION = "LOC";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_STREET_ADDRESS = "ESA";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_CITY = "ECITY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_DISTRICT = "ED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_ZIP_CODE = "ZC";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_INVALID_ZIP_CODE = "ZC";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_CITYLIST = "ECITYLIST";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_USERNAME_CHARACTERS_VIOLATION = "ESNCV";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_MANUALLY_LOGGED = "EML";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_NO_ACCOUNT = "ENA";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_SIGN_USING_GOOGLE = "ESUG";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_PASSWORD_RESET_CODE = "EEPRC";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_NOT_RECEIVED_PASSWORD_RESET_REQUESTED = "ENRPRR";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_INVALID_RESET_CODE = "EIRC";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_PASSWORD_RESET_CODE_EXPIRED = "EPRCE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_PROMOCODE_INVALID = "EPI";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_PROMOCODE = "EECODE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_DISPATCH_TYPE = "EEDT";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_EMPTY_STORE_LOCATION = "EESL";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_DISABLE_PICKUP = "EDP";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ERROR_DISABLE_DELIVERY = "EDD";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_USER_SAVE = "USERSAVESUCCESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_LOGGING = "LOGGED";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_ORDER_SUCCESSFULLY = "OS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_ADDRESS_SAVE_SUCCESSFULLY = "ADDRESSSAVESUCCESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_USER_UPDATE = "USERUPDATESUCCESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_VERIFY_GOOGLE = "GOOGLEVERIFYSUCCESS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_PASSWORD_RESET_CODE = "SPRC";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_PASSWORD_RESET = "SPR";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_PROMOCODE_VALID = "SPCV";
    public static final tkhub.project.kesbewa.services.Perfrences.AppPrefs INSTANCE = null;
    
    public final void setShowCaseVisibilityPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, int value) {
    }
    
    public final int getShowCaseVisibilityPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return 0;
    }
    
    public final void setOrderConfigPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.OrderConfigLog value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.OrderConfigLog getOrderConfigPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return null;
    }
    
    public final void setPushTokenPublishPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, boolean status) {
    }
    
    public final boolean getPushTokenPublishPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return false;
    }
    
    public final void setDeliveryChargesPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, float value) {
    }
    
    public final float getDeliveryChargesPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return 0.0F;
    }
    
    public final void setUserPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.User value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.User getUserPrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void setSelectPromoKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.PromoCode value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.PromoCode getSelectPromoKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void setSelectAdressManualKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.DeliveryAddress value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.DeliveryAddress getSelectAdressMaunalKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void setLocationManualKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.ManualLocation value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.ManualLocation getLocationMaunalKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void setLocationKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    tkhub.project.kesbewa.data.model.CurrentLocation value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.CurrentLocation getLocationKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void setIntKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    public final int getIntKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    public final void setStringKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringKeyValuePrefs(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void setOrderValuePrefs(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    tkhub.orderject.kesbewa.data.model.Order value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.orderject.kesbewa.data.model.Order getCartValuePrefs(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String genarateUniqOrderCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    public final boolean validateNIC(@org.jetbrains.annotations.NotNull()
    java.lang.String nic) {
        return false;
    }
    
    public final boolean validateEmailAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    public final boolean checkValidString(@org.jetbrains.annotations.NotNull()
    java.lang.String st) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAndroidid() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String encrypPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.NetworkError errorSomethingWentWrong() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final tkhub.project.kesbewa.data.model.NetworkError errorNoInternet() {
        return null;
    }
    
    private AppPrefs() {
        super();
    }
}