import kotlin.random.Random

class Person(val age: Int)

class Rectangle(val w:Int, var h:Int) {
    val isSquare: Boolean
    get() =  w == h
}

fun main(args:Array<String>){
    var p = Person(2)
    println(p)
    var r = Rectangle(Random.nextInt(), Random.nextInt())
    println(r.isSquare)
}
