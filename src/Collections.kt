

fun main(){


    val s = verify(1)
    println(s)




println(join(arrayListOf("a","b","c"), prefix = "111", separator = "22", postfix = "h"))
    println(join(arrayListOf("a","b","c")))

}

fun verify(number:Int) =   if (number in 0..100) number else throw IllegalAccessException("SHO ZA NAH, A NE $number")


fun <T> join(
    collection: Collection<T>,
    separator: String = "",
    prefix: String = "",
    postfix: String = ""
): String {
    var res = StringBuilder(prefix)
    for ((index, elem) in collection.withIndex()) {
        if (index > 0) res.append(separator)
        res.append(elem)
    }
    res.append(postfix)
    return res.toString()
}