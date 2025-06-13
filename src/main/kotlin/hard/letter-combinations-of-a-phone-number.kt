class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return emptyList()
        val mapper = mapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
        )
        val result = mutableListOf<String>()
        digits.forEach {
            val letters = mapper[it] ?: return@forEach
            if (result.isEmpty()) {
                result.addAll(letters.map { it.toString() })
            } else {
                val newResult = mutableListOf<String>()
                for (prefix in result) {
                    for (letter in letters) {
                        newResult.add(prefix + letter)
                    }
                }
                result.clear()
                result.addAll(newResult)
            }
        }
        return result
    }
}