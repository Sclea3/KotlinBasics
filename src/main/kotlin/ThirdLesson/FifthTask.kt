package ThirdLesson

fun main() {

    val moveString = "D2-D4;0"

    val fromSquare = moveString.substringBefore("-")
    val toSquare = moveString.substringAfter("-").substringBefore(";")
    val moveNumber = moveString.substringAfter(";").toInt()

    println("Откуда: $fromSquare")
    println("Куда: $toSquare")
    println("Номер хода: $moveNumber")
}

