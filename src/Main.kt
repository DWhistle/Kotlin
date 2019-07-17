import java.io.BufferedReader
import java.io.InputStreamReader
import Rectangle

fun main(args: Array<String>){
    var a = 2
    val b = 3
    println(a + b)
    compare(a,b)
    var reader = BufferedReader(InputStreamReader(System.`in`))
    var s = reader.readLine()
    println(s)
}

fun compare(a : Int, b:Int): Int{

    println("Blash ${a + b}")
    return a
}