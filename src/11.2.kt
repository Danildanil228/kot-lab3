/*
11.2
     Средний уровень
                    17 задание
 */
import kotlin.math.pow
import kotlin.math.sqrt
fun main() {
    println("Введите координаты вектора x1 y1 x2 y2 через пробел")
    val (x1, y1, x2, y2) = readLine()!!.split(" ").map { it.toDouble() }
    println("Введите координаты точки x3 y3 через пробел")
    val (x3, y3) = readLine()!!.split(" ").map { it.toDouble() }
    println("Координаты вектора:")
    println("x1 = $x1")
    println("y1 = $y1")
    println("x2 = $x2")
    println("y2 = $y2")
    println("Координаты точки:")
    println("x3 = $x3")
    println("y3 = $y3")

    val a = prResultAB(x1, y1, x2, y2, x3, y3)
    val b = prResultBC(x1, y1, x2, y2, x3, y3)
    val c = prResultCA(x1, y1, x2, y2, x3, y3)

    val area = calc(a, b, c)
    res(area)
}

fun prResultAB(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double {
    val x = x2 - x1
    val y = y2 - y1
    val result1 = sqrt(x.pow(2) + y.pow(2))
    return result1
}

fun prResultBC(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double {
    val x = x3 - x2
    val y = y3 - y2
    val result2 = sqrt(x.pow(2) + y.pow(2))
    return result2
}

fun prResultCA(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double {
    val x = x3 - x1
    val y = y3 - y1
    val result3 = sqrt(x.pow(2) + y.pow(2))
    return result3
}

fun calc(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) / 2
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    return area
}

fun res(area: Double) {
    println("Площадь треугольника равна $area")
}