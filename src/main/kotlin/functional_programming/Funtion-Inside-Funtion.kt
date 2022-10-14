package functional_programming

import java.lang.IllegalArgumentException

fun main() {
    val text = "Oke"
    setWord(text)
    tambah(0,0,0)
}

fun setWord(message: String){
    // printPesan(message) // error

    fun printPesan(text: String){
        println(text)
    }

    printPesan(message)
}

fun tambah(valueA: Int, valueB: Int, valueC: Int): Int {
    /*fun validateNumber(value: Int){
        if (value == 0){
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    SAMA SAJA DENGAN

    */

    fun Int.validateNumber(){
        if(this == 0){
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    //validateNumber(valueA)
    valueA.validateNumber()

    //validateNumber(valueB)
    valueB.validateNumber()

    //validateNumber(valueC)
    valueC.validateNumber()

    return valueA + valueB + valueC
}