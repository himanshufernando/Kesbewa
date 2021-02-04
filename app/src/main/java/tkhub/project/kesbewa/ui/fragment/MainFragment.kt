package tkhub.project.kesbewa.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.findNavController


import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.services.Perfrences.AppPrefs


/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    var appPrefs  = AppPrefs
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var inf = inflater.inflate(R.layout.fragment_main, container, false)

        if(appPrefs.getUserPrefs(context!!,AppPrefs.KEY_USER).user_name.isNullOrEmpty()){

            var showcase = appPrefs.getShowCaseVisibilityPrefs(context!!)
            if(showcase==0){
                findNavController(this).navigate(R.id.fragmentMainToShowCase)
            }else{
                findNavController(this).navigate(R.id.fragmentMainToLogin)
            }


        }else{
            findNavController(this).navigate(R.id.fragmentMainToHome)
        }


        return inf
    }

}
