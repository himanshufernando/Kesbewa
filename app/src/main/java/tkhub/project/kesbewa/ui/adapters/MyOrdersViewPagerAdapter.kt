package tkhub.project.kesbewa.ui.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import tkhub.project.kesbewa.ui.fragment.nav.myorders.CurrentOrdersFragment
import tkhub.project.kesbewa.ui.fragment.nav.myorders.PastOrdersFragment

const val CURRENT_PAGE_INDEX = 0
const val PAST_PAGE_INDEX = 1
/**/
class MyOrdersViewPagerAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {
    private val tabFragmentsCreators: Map<Int, () -> Fragment> = mapOf(
        CURRENT_PAGE_INDEX to { CurrentOrdersFragment() },
        PAST_PAGE_INDEX to { PastOrdersFragment() }
    )
    override fun getItemCount() = tabFragmentsCreators.size
    override fun createFragment(position: Int): Fragment {
        return tabFragmentsCreators[position]?.invoke() ?: throw IndexOutOfBoundsException()
    }

}