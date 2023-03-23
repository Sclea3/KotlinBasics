package SecondLesson

fun main(){

    val hoursStartTime = 9
    val minutesStartTime = 39
    val fullWayInMinutes = 457

    val startTimeInMinutes = hoursStartTime * 60 + minutesStartTime
    val endTimeInMinutes = startTimeInMinutes + fullWayInMinutes

    val endTimeHours: Int = endTimeInMinutes / 60
    val endTimeMinutes = endTimeInMinutes % 60

    println("End time is $endTimeHours:$endTimeMinutes")
}