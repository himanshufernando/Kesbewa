package tkhub.project.kesbewa.ui.fragment

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import kotlinx.android.synthetic.main.fragment_about.view.*
import tkhub.project.kesbewa.R
import tkhub.project.kesbewa.ui.activity.home.HomeActivity


class AboutFragment : Fragment() {

    lateinit var layout: View
    lateinit var dialogTermsConditions: Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        layout = inflater.inflate(R.layout.fragment_about, container, false)




        layout.imageview_navigation.setOnClickListener {
            (activity as HomeActivity).openDrawer()
        }

        layout.txt_terms_conditions.setOnClickListener {

            if (::dialogTermsConditions.isInitialized) {
                if (!dialogTermsConditions.isShowing) {
                    dialogTermsConditions.show()
                }
            } else {
                showDialogTermsConditions()
            }



        }

        return layout
    }

    private fun showDialogTermsConditions() {
        dialogTermsConditions = Dialog(context as Activity)
        dialogTermsConditions.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialogTermsConditions.window!!.setBackgroundDrawableResource(android.R.color.transparent)
        dialogTermsConditions.setContentView(R.layout.dialog_terms)
        dialogTermsConditions.setCancelable(true)
        dialogTermsConditions.show()

    }
}