package example.test

import java.util.*
import kotlin.system.measureNanoTime

fun feedTheFish(){
    val day = randomDay()
    var food = "pellets"
    println("Today is $day and the fish eat $food")
}

fun randomDay(): String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

// var decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")



fun main(args: Array<String>){
    //example.test.feedTheFish()
    //val day = example.test.randomDay()
    //val food = example.test.fishFood(day)
    //println("Today is $day and the fish eat $food")

    //val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday",
    //    "Friday", "Saturday", "Sunday")

    //val test = arrayOf(1, 2, 3, 5, 6, 7, 8, 9, 10)
    //println( test.filter { it%2 == 0 } )

    //var list = listOf(1, 2, 3, 5, 6)
    //var result = list
    //   .asSequence()
    //   .map { println("In Map"); it * 2 }
    //   .filter { println("In Filter"); it % 3 == 0 }

    //println("Before Average")
    //println(result.average())
    val sequence = generateSequence(1) { it + 1 }.take(50000000)
    val list = sequence.toList()

    //println("List Map Sum=        "  + measureNanoTime { list.map { it * 2 }.sum() })
    //println("Sequence Map Sum     "  + measureNanoTime { sequence.map { it * 2 }.sum() })
    //println("List Map Average     "  + measureNanoTime { list.map { it * 2 }.average() })
    //println("Sequence Map Average "  + measureNanoTime { sequence.map { it * 2 }.average() })

//    println("List Filter Sum         " + measureNanoTime { list.filter { it % 3 == 0 }.sum() })
//    println("Sequence Filter Sum     "  + measureNanoTime { sequence.filter { it % 3 == 0 }.sum() })
//    println("List Filter Average     "  + measureNanoTime { list.filter { it % 3 == 0 }.average() })
//    println("Sequence Filter Average "  + measureNanoTime { sequence.filter { it % 3 == 0 }.average() })

    println("List Map Filter Sum         " + measureNanoTime { list.map { it * 2 }.filter { it % 3 == 0 }.sum() })
    println("Sequence Map Filter Sum     " + measureNanoTime { sequence.map { it * 2 }.filter { it % 3 == 0 }.sum() })
    println("List Map Filter Average     " + measureNanoTime {  list.map { it * 2 }.filter { it % 3 == 0 }.average() })
    println("Sequence Map Filter Average " + measureNanoTime { sequence.map { it * 2 }.filter { it % 3 == 0 }.average() })

}