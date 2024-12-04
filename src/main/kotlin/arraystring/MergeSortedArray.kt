package com.rooftopdevs.arraystring

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        val totalCount = m + n
        var nums2CursorIndex = 0

        (0..<totalCount).forEach{ i ->
            if (nums1[i] != 0 || (nums2CursorIndex == nums2.size)) return@forEach
            nums1[i] = nums2[nums2CursorIndex]
            nums2CursorIndex++
        }

        nums1.sort()
    }
}