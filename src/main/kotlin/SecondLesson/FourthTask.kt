package SecondLesson

fun main(){
    val crystals = 7
    val iron = 11
    val buffValue = 0.2

    val crystalsWithBuff = crystals * buffValue
    val ironWithBuff = iron * buffValue

    println("Bonus crystals: " + crystalsWithBuff.toInt())
    println("Bonus iron: " + ironWithBuff.toInt())
}