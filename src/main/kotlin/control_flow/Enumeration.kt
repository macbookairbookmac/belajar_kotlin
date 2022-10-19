fun main() {

    val colorMerah = Color.RED
    val colorRed = Color.RED.value // 16711680
    val colorRedStr = Color.RED.value.toString(16) // ff0000

    val namaRibet = NameRibet.JONRY.value
    val nameSimple = NameSimple.JONRY

    val a = arrayOf(colorRed, colorRedStr, namaRibet, nameSimple)

    for (i in a) {
        println(i)
    }

    println()

    val colorAbs = ColorWithAbstract.BLUE
    colorAbs.printValue()

    println()

    val colors: Array<Color> = enumValues()
    colors.forEach {
        println(it)
    }

    println()

    when(colorMerah){
        Color.BLUE -> print("BLUE")
        Color.RED -> print("RED")
        Color.GREEN -> print("GREEN")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class NameRibet(val value: String) {
    JONRY("Jonry"),
    BUDI("Budi"),
    TONO("Tono")
}

enum class NameSimple {
    JONRY, BUDI, TONO
}

enum class ColorWithAbstract(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED is $value")
        }

    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }

    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }

    };

    abstract fun printValue()
}