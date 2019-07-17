import java.lang.IllegalArgumentException

interface Expr
class Num(val value: Int) : Expr
class Sum(val left : Expr, val right: Expr) : Expr

fun eval(e:Expr): Int =
    if (e is Num){
         e.value
    }
    else if (e is Sum){
         eval(e.right) + eval(e.left)
    }
    else {
        throw IllegalArgumentException("Unknown")
    }


fun evalWithReturn(e:Expr): Int{
    if (e is Num){
        return e.value
    }
    else if (e is Sum){
        return eval(e.right) + eval(e.left)
    }
    else
        throw IllegalArgumentException("Unknown")
}

fun evalWithWhen(e:Expr) = when(e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
    else -> throw IllegalArgumentException("exc")
}


fun prints() { println(eval(Sum(Num(2), Num(2))))}



fun main(){
    val e = Num(4)
    val n = e as Expr
    prints()
}