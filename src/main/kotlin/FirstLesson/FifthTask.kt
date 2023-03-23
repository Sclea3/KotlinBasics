package FirstLesson

fun main() {
    val secondsInSpace = 6480
    val minutesInSpace = secondsInSpace / 60
    val secondsFromDivision = secondsInSpace % 60

    print("$minutesInSpace:0$secondsFromDivision")
}