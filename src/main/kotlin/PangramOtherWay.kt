
fun main(args: Array<String>) {
        val s = readLine()!!

        val result = pangram(s)

        println(result)
    }

fun pangram(input: String): String{
    val lowerstring = input.map {it.toLowerCase()}
    val containsAlpha:Boolean = ('a'..'z').all {lowerstring.contains(it)}
    if(containsAlpha) return "pangram"
    else return "not pangram"
}