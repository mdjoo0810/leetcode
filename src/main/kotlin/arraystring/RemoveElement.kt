package com.rooftopdevs.arraystring

class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val filteredList = nums.filter { it != `val` }

        filteredList.indices.forEach { i ->
            nums[i] = filteredList[i]
        }

        return filteredList.size
    }
}