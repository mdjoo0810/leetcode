package com.rooftopdevs.arraystring

class RemoveDuplicatesFromSortedArray2 {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 2) return nums.size

        var slot = 2

        for (i in 2 until nums.size) {
            if (nums[i] != nums[slot - 2]) {
                nums[slot++] = nums[i]
            }
        }

        return slot
    }
}
