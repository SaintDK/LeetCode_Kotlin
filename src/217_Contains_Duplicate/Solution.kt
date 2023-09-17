package `217_Contains_Duplicate`

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var unique = intArrayOf()
        for (i in nums) {
            if (!unique.contains(i)) { unique = unique.plus(i) }
        }
        if (unique.contentEquals(nums)){return false} else return true

    }
}