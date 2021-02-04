package tkhub.project.kesbewa.ui.fragment.nav.showcase

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.viewpager2.widget.ViewPager2

import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import kotlinx.android.synthetic.main.fragment_show_case_view_page.*

import tkhub.project.kesbewa.ui.adapters.ShowCaseViewPagerAdapter


class ShowCaseViewPageFragment : Fragment() {



    lateinit var mainActivity: HomeActivity

    var appPrefs  = AppPrefs


    internal lateinit var adapterContest: ShowCaseViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_show_case_view_page, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        trasperat()
        appPrefs.setIntKeyValuePrefs(context!!, AppPrefs.KEY_FRAGMENT_ID,11)
        adapterContest = ShowCaseViewPagerAdapter(this)

        view_pager_showcase.isUserInputEnabled = false



        cl_next.setOnClickListener {
            view_pager_showcase.currentItem = 1
        }


        cl_finish.setOnClickListener {
            appPrefs.setShowCaseVisibilityPrefs(context!!,1)
            findNavController(this).navigate(R.id.fragmentShowCaseToLogin)
        }


        cl_back.setOnClickListener {
            view_pager_showcase.currentItem = 0
        }

        view_pager_showcase.apply {
            adapter = adapterContest
            offscreenPageLimit = ShowCaseViewPagerAdapter.TRANSACTION_SCREEN_OFFSCREEN_LIMIT as Int
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    when (position) {
                        0 -> {
                            cl_finish.visibility = View.GONE
                            cl_next.visibility = View.VISIBLE
                            cl_back.visibility = View.GONE
                        }
                        1 -> {
                            cl_finish.visibility = View.VISIBLE
                            cl_next.visibility = View.GONE
                            cl_back.visibility = View.VISIBLE

                        }

                    }
                }
            })

        }



     /*   cl_one_next.setOnClickListener {

            view_pager_showcase.currentItem = 1

        }*/



    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        mainActivity = (activity as HomeActivity)
    }

    override fun onResume() {
        super.onResume()

    }

    override fun onStop() {


        super.onStop()
    }

    override fun onPause() {
        super.onPause()

    }


    private fun trasperat() {
        if (Build.VERSION.SDK_INT in 19..20) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true)
        }
        if (Build.VERSION.SDK_INT >= 19) {
            activity?.window!!.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            activity?.window!!.statusBarColor = Color.TRANSPARENT
            //activity?.window!!.navigationBarColor = Color.TRANSPARENT
        }
    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = activity?.window
        val winParams = win?.attributes
        if (on) {
            winParams!!.flags = winParams.flags or bits
        } else {
            winParams!!.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }


}