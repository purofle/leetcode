package easy

class Solution35 {
    fun searchInsert(nums: IntArray, target: Int): Int {
        nums.forEachIndexed { index: Int, i: Int ->
            if (i >= target) {
                return index
            }
        }
        return nums.size
    }
}