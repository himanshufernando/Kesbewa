package tkhub.project.kesbewa.ui.fragment.nav.showcase

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.ui.activity.home.HomeActivity


class ShowCaseOneFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_case_one, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.one))
        imageList.add(SlideModel(R.drawable.two))
        imageList.add(SlideModel(R.drawable.three))
        imageList.add(SlideModel(R.drawable.four))
        imageList.add(SlideModel(R.drawable.five))
        imageList.add(SlideModel(R.drawable.six))

        var imageSlider = view.findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP)

    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)

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

}