/*
11.3
     Базовый уровень
                    17 задание
 */
open class School(var name: String, var countStud: Int, var countGraduate: Int) {
    open fun calculateQuality(): Double {
        return countGraduate.toDouble() / countStud.toDouble()
    }

    fun displayInfo() {
        println("Название заведения: $name")
        println("Количество студентов на 1 курсе: $countStud")
        println("Количество выпускников: $countGraduate")
    }
}
class SchoolWithQuality(name: String, countStud: Int, countGraduate: Int, var p: Int) : School(name, countStud, countGraduate) {
    override fun calculateQuality(): Double {
        val q = super.calculateQuality()
        return q * (p.toDouble() / 100)
    }
}
fun main() {
    print("Введите название учебного заведения: ")
    val name = readLine() ?: ""

    print("Введите количество студентов зачисленных на 1-й курс: ")
    val countInput = readLine() ?: ""
    val countStud = countInput.toIntOrNull() ?: 0

    print("Введите количество выпускников: ")
    val countGraduateInput = readLine() ?: ""
    val countGraduate = countGraduateInput.toIntOrNull() ?: 0

    print("Введите процент выпускников, которые работают по специальности: ")
    val pInput = readLine() ?: ""
    val p = pInput.toIntOrNull() ?: 0

    val school = School(name, countStud, countGraduate)
    println("Информация о заведении:")
    school.displayInfo()
    println("Качество Q: ${school.calculateQuality()}")

    val schoolWithQuality = SchoolWithQuality(name, countStud, countGraduate, p)
    println("Информация о заведении с учетом качества:")
    schoolWithQuality.displayInfo()
    println("Качество Qp: ${schoolWithQuality.calculateQuality()}")
}