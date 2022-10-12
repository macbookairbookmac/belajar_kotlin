package functional_programming

fun main() {
    val list = listOf(
        User("Jonry", 25),
        User("Budi", 20),
        User("Andi", 30),
    )

    println("Usual approach ${getUsernameUsual(list)}")
    println("Fp approach ${getUsernameFp(list)}")
    println()
    println("Filter user with age 20 : ${getUsernameFilterAge(list,20)}") // original function 1
    println("User with age 30 : ${getUserWithAge30(list)}") // original function 2
    println("User with age 25 : ${getUserWithAge30(list, 25)}") // can overwrite

}

// with usual approach
fun getUsernameUsual(list: List<User>): List<String> {
    val name = mutableListOf<String>()
    for (user in list) {
        name.add(user.name)
    }
    return name
}

// with FP approach
fun getUsernameFp(list: List<User>): List<String> {
    return list.map {
        it.name
    }
}

fun getUsernameFilterAge(list: List<User>, age: Int): List<String> {
    return list.filter {
        it.age == age
    }
        .map {
            it.name
        }
}

fun getUserWithAge30(list: List<User>, age: Int = 30): List<String>{
    return list.filter {
        it.age == age
    }.map {
        it.name
    }
}

data class User(val name: String, val age: Int)