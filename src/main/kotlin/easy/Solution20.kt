package easy

/**
 * https://leetcode.cn/problems/valid-parentheses/
 * 20. 有效的括号
 */
class Solution20 {
    fun isValid(s: String): Boolean {
        val matchMap = mapOf(')' to '(', ']' to '[', '}' to '{')
        val tempList = mutableListOf<Char>()

        for (ch in s) {
            when (ch) {
                in "([{".toCharArray() -> tempList.add(ch)
                in ")]}".toCharArray() -> {
                    if (tempList.isEmpty()) {
                        return false
                    }

                    if (matchMap[ch] == tempList.last()) {
                        tempList.removeAt(tempList.size - 1)
                    } else {
                        return false
                    }
                }
            }
        }
        return tempList.isEmpty()
    }
}