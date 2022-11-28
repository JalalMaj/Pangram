fun pangrams(s: String): String {
    // Write your code here
    var alphabet = mutableListOf<Char>()
    var result = mutableListOf<Char>()

   // Creat a list with alphabets
    for(char in 'a'..'z'){
        alphabet.add(char)
    }

    // Go through the elements in the input string and check if not in the result list then add it
        for(char in s){
            if(!result.contains(char) && char !=' '){
                result.add(char)
            }
        }
   // Replace the upper case alphabets to lower case in the result list
    for(char in result){
        if(char.isUpperCase()){
          val itchar= char.toLowerCase()
          val indexChar = result.indexOf(char)
          result[indexChar]= itchar
        }
    }
   // Compar alphabet set with result set
    if(alphabet.toSet().equals(result.toSet())){
        return "pangram"
    }else return "not pangram"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = pangrams(s)

    println(result)
}
