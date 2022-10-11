fun main() {
    val dataUser = DataUser("Jonry", 25)

    val dataUserArr = arrayOf(
        dataUser,
        dataUser.copy(),
        dataUser.copy(age = 8)
    )

    dataUserArr.forEach {
        println(it)
    }
    println()

    val nama = dataUser.component1()
    val umur = dataUser.component2()
    println("my name is $nama, my age $umur years old")
    println()

    val (name, age) = dataUser
    println("my name is $name, my age $age years old")
}

data class DataUser(
    val name: String,
    val age: Int
)