

package tkhub.project.kesbewa.ui.fragment.nav.myorders

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import androidx.viewpager2.widget.ViewPager2
import coil.api.load
import coil.transform.GrayscaleTransformation
import kotlinx.android.synthetic.main.fragment_my_orders.view.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.services.Perfrences.AppPrefs
import tkhub.project.kesbewa.ui.activity.home.HomeActivity
import tkhub.project.kesbewa.ui.adapters.MyOrdersViewPagerAdapter


/**
 * A simple [Fragment] subclass.
 */
class MyOrdersViewPagerFragment : Fragment(),View.OnClickListener {

    lateinit var root :View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_my_orders, container, false)


        AppPrefs.setIntKeyValuePrefs(context!!, AppPrefs.KEY_FRAGMENT_ID, 8)

        (activity as HomeActivity).setDrawer()


        root.view_pager.adapter = MyOrdersViewPagerAdapter(this)

        root.constraintLayout_past.setOnClickListener(this)
        root.imageview_navigation.setOnClickListener(this)
        root.constraintLayout_current.setOnClickListener(this)




        var doppelgangerPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if(position==0){
                    root.imageView_past.load(R.drawable.recycled_bag) {
                        crossfade(true)
                        transformations(GrayscaleTransformation())
                    }
                    root.imageView_current.load(R.drawable.motorbike) {
                        crossfade(true)

                    }
                    context?.resources?.getColor(R.color.textcolor0)?.let {
                        root.textview_current.setTextColor(
                            it
                        )
                    }
                    context?.resources?.getColor(R.color.textcolor4)?.let {
                        root.textview_past.setTextColor(
                            it
                        )
                    }

                }else if (position==1){
                    root.imageView_past.load(R.drawable.recycled_bag) {
                        crossfade(true)
                    }

                    root.imageView_current.load(R.drawable.motorbike) {
                        crossfade(true)
                        transformations(GrayscaleTransformation())
                    }

                    context?.resources?.getColor(R.color.textcolor4)?.let {
                        root.textview_current.setTextColor(
                            it
                        )
                    }
                    context?.resources?.getColor(R.color.textcolor0)?.let {
                        root.textview_past.setTextColor(
                            it
                        )
                    }
                }

            }
        }

        root.view_pager.registerOnPageChangeCallback(doppelgangerPageChangeCallback)


        return root
    }



    override fun onClick(v: View) {

        when (v.id) {
            R.id.imageview_navigation -> {
                (activity as HomeActivity).openDrawer()
            }
            R.id.constraintLayout_past -> {
                if( root.view_pager.currentItem!=1){
                    root.view_pager.currentItem = 1

                    root.imageView_past.load(R.drawable.recycled_bag) {
                        crossfade(true)
                    }

                    root.imageView_current.load(R.drawable.motorbike) {
                        crossfade(true)
                        transformations(GrayscaleTransformation())
                    }


                    context?.resources?.getColor(R.color.textcolor4)?.let {
                        root.textview_current.setTextColor(
                            it
                        )
                    }

                    context?.resources?.getColor(R.color.textcolor0)?.let {
                        root.textview_past.setTextColor(
                            it
                        )
                    }




                }
            }
            R.id.constraintLayout_current -> {
                if( root.view_pager.currentItem!=0){
                    root.view_pager.currentItem = 0

                    root.imageView_current.load(R.drawable.motorbike) {
                        crossfade(true)
                    }

                    root.imageView_past.load(R.drawable.recycled_bag) {
                        crossfade(true)
                        transformations(GrayscaleTransformation())
                    }

                    context?.resources?.getColor(R.color.textcolor0)?.let {
                        root.textview_current.setTextColor(
                            it
                        )
                    }

                    context?.resources?.getColor(R.color.textcolor4)?.let {
                        root.textview_past.setTextColor(
                            it
                        )
                    }


                }
            }
        }
    }


}
