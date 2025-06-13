package hard


/**
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 */
class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if (nums.size < 3) {
            return emptyList()
        }
        nums.sort()
        val result = mutableListOf<List<Int>>()
        var num1 = 0
        var num2 = 0
        var num3 = 0
        for (i in nums.indices) {
            if (i > 0 && nums[i] == nums[i - 1]) continue
            num1 = nums[i]
            var left = i + 1
            var right = nums.size - 1
            while (left < right) {
                num2 = nums[left]
                num3 = nums[right]
                val sum = num1 + num2 + num3
                when {
                    sum < 0 -> left++
                    sum > 0 -> right--
                    else -> {
                        result.add(listOf(num1, num2, num3))
                        while (left < right && nums[left] == num2) left++
                        while (left < right && nums[right] == num3) right--
                    }
                }
            }
        }
        return result
    }
}