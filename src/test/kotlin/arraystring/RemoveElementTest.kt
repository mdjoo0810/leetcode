package arraystring

import com.rooftopdevs.arraystring.RemoveElement
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RemoveElementTest {
    val solution = RemoveElement()

    @Test
    fun `case1`() {
        val nums = intArrayOf(3,2,2,3)
        val `val` = 3

        val results = solution.removeElement(nums, `val`)
        assertEquals(2, results)
        assertEquals(listOf(2,2), nums.slice(0..<results).toList())
    }

    @Test
    fun `case2`() {
        val nums = intArrayOf(0,1,2,2,3,0,4,2)
        val `val` = 2

        val results =  solution.removeElement(nums, `val`)
        assertEquals(5, results)
        assertEquals(listOf(0,1,3,0,4), nums.slice(0..<results).toList())
    }
}
