package easy

import kotlin.math.sqrt

/**
 * https://leetcode.cn/problems/arranging-coins/
 * 441. 排列硬币
 */
class Solution441 {
    fun arrangeCoins(n: Int): Int {
        return ((-1 + sqrt((1 + 8L * n).toDouble())) / 2).toInt()
    }
}