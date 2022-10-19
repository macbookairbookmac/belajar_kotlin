fun main() {
    val alphabetsLst = listOf('A','B','C','D','E') // defaultnya immutable/ tidak bisa dimodifikasi
    alphabetsLst.forEach {
        print("$it ")
    }
    println()

    val alphabetMut = mutableListOf('F','G','H','I','J') // bisa dimodifikasi karna mutable
    alphabetMut.forEach {
        print("$it ")
    }
}