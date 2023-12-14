package easy

// https://leetcode.cn/problems/two-sum/
// 1. 两数之和
class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashtable = HashMap<Int, Int>()
        for (i in nums.indices) {
            if (hashtable.containsKey(target - nums[i])) {
                return intArrayOf(hashtable[target - nums[i]]!!, i)
            }
            hashtable[nums[i]] = i
        }
        return intArrayOf()
    }
}

fun main() {
    println(Solution1().twoSum(intArrayOf(2, 7, 11, 15), 9).toList())
}