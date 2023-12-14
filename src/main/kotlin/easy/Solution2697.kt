package easy

import kotlin.math.min

/**
 * https://leetcode.cn/problems/lexicographically-smallest-palindrome/description/
 * 2697. 字典序最小回文串
 */
class Solution2697 {
    fun makeSmallestPalindrome(s: String): String {
        val array = s.toCharArray()
        var start = 0
        var end = array.size - 1
        while (start < end) {
            if (array[start] != array[end]) {
                // 如果该位置上 a 中对应字母比 b 中对应字母在字母表中出现顺序更早，则认为 a 的字典序比 b 的字典序要小。
                array[end] = min(array[start].code, array[end].code).toChar()
                array[start] = array[end]
            }
            start++
            end--
        }
        return array.concatToString()
    }
}

fun main() {
    println(Solution2697().makeSmallestPalindrome("egcfe"))
}