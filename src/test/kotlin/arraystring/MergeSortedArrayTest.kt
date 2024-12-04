package arraystring

import com.rooftopdevs.arraystring.MergeSortedArray
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeSortedArrayTest {

    val solution = MergeSortedArray()

    @Test
    fun `case1`() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val m = 3
        val nums2 = intArrayOf(2, 5, 6)
        val n = 3

        solution.merge(nums1, m, nums2, n)

        assertEquals(intArrayOf(1, 2, 2, 3, 5, 6).toList(), nums1.toList())
    }

    @Test
    fun `case2`() {
        val nums1 = intArrayOf(1)
        val m = 1
        val nums2 = intArrayOf()
        val n = 0

        solution.merge(nums1, m, nums2, n)

        assertEquals(intArrayOf(1).toList(), nums1.toList())
    }

    @Test
    fun `case3`() {
        val nums1 = intArrayOf(0)
        val m = 0
        val nums2 = intArrayOf(1)
        val n = 1

        solution.merge(nums1, m, nums2, n)

        assertEquals(intArrayOf(1).toList(), nums1.toList())
    }
}
