package arraystring

import com.rooftopdevs.arraystring.RemoveDuplicatesFromSortedArray2
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveDuplicatesFromSortedArray2Test {

    val solution = RemoveDuplicatesFromSortedArray2()

    @Test
    fun `case1`() {
        val nums = intArrayOf(1,1,1,2,2,3)

        val result = solution.removeDuplicates(nums)

        assertEquals(5, result)
        assertEquals(listOf(1,1,2,2,3), nums.slice(0..<result))
    }

    @Test
    fun `case2`() {
        val nums = intArrayOf(0,0,1,1,1,1,2,3,3)

        val result = solution.removeDuplicates(nums)

        assertEquals(7, result)
        assertEquals(listOf(0,0,1,1,2,3,3), nums.slice(0..<result))
    }
}