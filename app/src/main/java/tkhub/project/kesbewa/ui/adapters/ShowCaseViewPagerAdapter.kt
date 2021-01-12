package tkhub.project.kesbewa.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import tkhub.project.kesbewa.ui.fragment.nav.showcase.ShowCaseOneFragment
import tkhub.project.kesbewa.ui.fragment.nav.showcase.ShowCaseTwoFragment


const val SHOWCASE_ONE_INDEX = 0
const val SHOWCASE_TWO_INDEX = 1

class ShowCaseViewPagerAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {
    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        SHOWCASE_ONE_INDEX to { ShowCaseOneFragment() },
        SHOWCASE_TWO_INDEX to { ShowCaseTwoFragment() }
    )
    override fun getItemCount() = tabFragmentsCreators.size
    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }

}