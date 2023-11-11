data class Person(var firstName: String?, var lastName: String?, var profession: String?, var stack: String?)

fun main(args: Array<String>) {
    val isaac: Person? = null

    isaac?.apply {
        firstName = "Isaac"
        lastName = "Kariithi"
        profession = "Android developer"
        stack = "Kotlin and Java"
    }

    println(isaac)
//some small changes to test something nothing serious dev!!!!
}