


fun main(){
    val prog = 1..20
    println(prog)


    for (i in 100 downTo 1 step 2){
        println(i)
    }
    var testMap = HashMap<Int, String>()
    for (c in 'A'..'Z') {
        testMap[c.toInt()] = c.toString()
    }
    for ((digit, letter) in testMap){
        println("digit = $digit, letter = $letter")
    }

    val list = arrayListOf<String>("1231", "2323", "244")
    for ((index, value) in list.withIndex())
    {
        println("List: index = $index, value = $value")
    }




    fun isLetter(c:Char) = c in 'a'..'z'|| c in 'A'..'Z'
    fun isDigit(c:Char) = c !in '0'..'9'

    
}