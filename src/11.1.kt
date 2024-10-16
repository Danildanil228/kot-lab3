/*
11.1
     Средний уровень
                    17 задание
 */
import kotlin.math.sqrt
import kotlin.math.pow
fun main(){
    println("Введите координаты вектора x1 y1 x2 y2 через пробел")
    var (x1, y1, x2, y2) = readLine()!!.split(" ").map { it.toDouble() }
    println("x1 = $x1")
    println("y1 = $y1")
    println("x2 = $x2")
    println("y2 = $y2")
    printResult(x1, y1, x2, y2)
}
fun printResult(x1: Double, y1: Double, x2: Double, y2: Double,){
    var x = x2-x1
    var y = y2-y1
    var result:Double = sqrt(x.pow(2) + y.pow(2))
    println("Длина вектора С координатами ($x1;$y1) ($x2;$y2) равна: $result")
}