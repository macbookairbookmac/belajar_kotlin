package data_classes_collection
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val alphabets = listOf('I', 'B', 'D', 'C', 'E', 'A', 'G', 'F')

    val alphabetPerfect = ('A'..'Z').toList()
    println(alphabetPerfect)

    // filter operation
    val evenNumber = numbers.filter { it % 2 == 0 }
    println(evenNumber)

    val oddNumber = numbers.filterNot { it % 2 == 0 }
    println(oddNumber)

    // map operation
    val multipliedBy5 = numbers.map { it * 5 }
    println(multipliedBy5)

    // count operation
    val countList = numbers.count()
    println(countList)

    val countEvenNumber = numbers.count { it % 2 == 0 }
    println(countEvenNumber)

    // find operation
    val elevenNumber = numbers.find { it == 11 }
    println(elevenNumber) // null

    val tenNumber = numbers.find { it == 10 }
    println(tenNumber) // 10

    val firstOddNumber = numbers.find { it % 2 == 1 }
    println(firstOddNumber)

    // firstOrNull & lastOrNull operation
    val firstOrNullNumber = numbers.firstOrNull { it % 2 == 3 } // always null
    println(firstOrNullNumber)

    val lastOrNullNumber = numbers.lastOrNull()
    println(lastOrNullNumber) // 10

    // first & last operation
    val moreThan5 = numbers.first { it > 5 }
    println(moreThan5) // 6

    val moreThan6 = numbers.last { it > 6 }
    println(moreThan6) // 10

    // sum operation for number only
    val total = numbers.sum()
    println(total)

    // sorted operation
    val asc = alphabets.sorted()
    println(asc)

    val desc = alphabets.sortedDescending()
    println(desc)
}