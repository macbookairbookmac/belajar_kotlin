fun main(){
    val testString = """
        Ini jelas sangat berbeda
        bisa kek gini
        kayak swift aja 
        :D
        """

    println(testString.trimIndent()) // trimIndent() akan menghapus semua ruang kosng yang terlihat pada variable
}