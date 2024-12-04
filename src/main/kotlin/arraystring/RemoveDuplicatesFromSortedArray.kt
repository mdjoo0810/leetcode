package com.rooftopdevs.arraystring

class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var k = 1

        for (i in 1 until nums.size) {
            if (nums[i] != nums[k - 1]) {
                nums[k++] = nums[i]
            }
        }

        return k
    }
}