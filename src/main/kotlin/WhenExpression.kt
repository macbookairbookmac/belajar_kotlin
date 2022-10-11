fun main(){
    val anyType: Any = 100L // menentukan type file yang sebenarnya meskipun 'any'
    when(anyType){
        is Long -> println("Long")
        is Int -> println("Int")
        is String -> println("String")
        else -> println("undefined")
    }
    println()

    val a = 10
    val b = 20
    val c = 10..20

    when(a){
        in c -> println("ada")
    }

    when(b){
        in c -> println("ada")
    }
    println()
}

class WhenExpression {
}