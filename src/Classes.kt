import java.lang.Exception
import Color
enum class Color(val r:Int, val g:Int, val b:Int){
    RED(255, 0,0 ),
    ORANGE(255, 125,125 ),
    BLUE(0, 0,255 ),
    YELLOW(125, 125,0 );
    fun rgb() = r + g + b
}
fun getColor(color: Color) =
        when (color){
            Color.BLUE -> "blue"
            Color.RED -> "red"
            Color.YELLOW,Color.ORANGE -> "same"
        }
fun mix(c1: Color, c2:Color) =
    when (setOf(c1,c2)){
        setOf(Color.BLUE, Color.ORANGE) -> Color.RED
        setOf(Color.YELLOW, Color.RED) -> Color.ORANGE
        else -> throw Exception("wtf")
    }

fun main(){
    println(Color.BLUE.rgb())
    println(getColor(Color.BLUE))
    println(mix(Color.YELLOW, Color.RED))
}