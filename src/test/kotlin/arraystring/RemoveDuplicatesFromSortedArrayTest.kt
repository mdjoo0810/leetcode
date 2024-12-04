package arraystring

import com.rooftopdevs.arraystring.RemoveDuplicatesFromSortedArray
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveDuplicatesFromSortedArrayTest {
    val solution = RemoveDuplicatesFromSortedArray()

    @Test
    fun `case1`() {
        val nums = intArrayOf(1,1,2)

        val result = solution.removeDuplicates(nums)

        assertEquals(2, result)
        assertEquals(listOf(1,2), nums.slice(0..<result))
    }

    @Test
    fun `case2`() {
        val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)

        val result = solution.removeDuplicates(nums)

        assertEquals(5, result)
        assertEquals(listOf(0,1,2,3,4), nums.slice(0..<result))
    }
}
