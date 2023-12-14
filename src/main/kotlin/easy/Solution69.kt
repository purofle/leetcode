package easy

class Solution69 {
    fun mySqrt(x: Int): Int {
        val math = Class.forName("java.lang.Math")
        val powMethod = math.getMethod("pow", Double::class.javaPrimitiveType, Double::class.javaPrimitiveType)
        val result = powMethod.invoke(null, x, 0.5) as Double
        return result.toInt()
    }
}

fun main() {
    println(Solution69().mySqrt(4))
}