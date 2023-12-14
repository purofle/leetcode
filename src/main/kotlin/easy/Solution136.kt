package easy

/**
 * https://leetcode.cn/problems/single-number/
 * 136. 只出现一次的数字
 */
class Solution136 {
    fun singleNumber(nums: IntArray): Int {
        var i = 0
        nums.forEach {
            i = i xor it
        }
        return i
    }
}