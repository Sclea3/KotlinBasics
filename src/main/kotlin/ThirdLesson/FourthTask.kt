package ThirdLesson

fun main() {

    var fromSquare = "E2"
    var toSquare = "E4"
    var moveNumber = 1

    var moveString = "$fromSquare-$toSquare;$moveNumber"

    println(moveString)

    fromSquare = "D2"
    toSquare = "C3"
    moveNumber = 2

    moveString = "$fromSquare-$toSquare;$moveNumber"

    println(moveString)
}
