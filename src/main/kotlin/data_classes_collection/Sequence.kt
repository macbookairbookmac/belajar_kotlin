fun main() {
    val list = (1..1000000).toList()

    // sequence masuk ke kategory lazy evaluation, bukan eager evaluation
    // sequence hanya akan mengevaluasi item jika benar-benar diperlukan

    // DIDN'T recommend, coz too long
    /*
    list
        .filter { it % 5 == 0 } // angka 1 tidak memenuhi kriteria
        .map { it * 2 } // angka 1 TETAP di check
        .forEach { println(it) } // angka 1 TETAP di check
     */


    // RECOMMENDED

    list
        .asSequence() // as sequence
        .filter { it % 5 == 0 } // angka 1 tidak memenuhi kriteria
        .map { it * 2 } // angka 1 TIDAK di check lagi
        .forEach {
            print("$it, ")
        } // angka 1 TIDAK dicheck lagi

    println("\n")

    // membuat sequence variable

    //val sequenceNumber = generateSequence(1) { it + 1 } // infinite loop

    val sequenceNumber = generateSequence(1) { it + 1 }.take(5) // data hanya berjumlah 5
    sequenceNumber.forEach {
        print("$it ")
    }



}