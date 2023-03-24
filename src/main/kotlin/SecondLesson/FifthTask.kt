package SecondLesson

fun main() {
    val amount = 70000
    val interestRate = 0.167
    val years = 20

    val result = amount * Math.pow(1 + interestRate, years.toDouble())

    println("%.3f".format(result))
}