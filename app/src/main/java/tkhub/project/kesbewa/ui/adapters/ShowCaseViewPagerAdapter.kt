package tkhub.project.kesbewa.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import tkhub.project.kesbewa.ui.fragment.nav.showcase.ShowCaseOneFragment
import tkhub.project.kesbewa.ui.fragment.nav.showcase.ShowCaseTwoFragment


const val SHOWCASE_ONE_INDEX = 0
const val SHOWCASE_TWO_INDEX = 1

internal class ShowCaseViewPagerAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun createFragment(position: Int): Fragment = when (position) {
        SHOWCASE_ONE_INDEX -> ShowCaseOneFragment()
        SHOWCASE_TWO_INDEX -> ShowCaseTwoFragment()
        else -> throw IllegalStateException("Invalid adapter position")
    }

    override fun getItemCount(): Int = 2
    companion object {
        internal const val TRANSACTION_SCREEN_OFFSCREEN_LIMIT = 1
        internal const val TRANSACTION_SCREENS_NUMBER = 2
        internal const val SHOWCASE_ONE_INDEX = 0
        internal const val SHOWCASE_TWO_INDEX = 1

    }

}