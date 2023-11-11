data class Course(var courseName: String?, var courseTitle:String)

fun main(args: Array<String>) {
    val techie: Course? = null

    techie?.apply {
         courseName = "Computer science"
        courseTitle = "Android development with kotlin"

    }

    println(techie)
//introduced this code for some testing dev!!
    //still playing with git commands relax dev !!
}