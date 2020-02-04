package example.myapp

fun buildAquarium(){
    val aquarium = Aquarium(length = 25, width = 25, height = 40)
    aquarium.printSize()

    val myTowerTank = TowerTank(diameter = 25, height = 40)
    myTowerTank.printSize()
}

fun makeFish(){
    val shark = Shark()
    val plecostomus = Plecostomus()

    println("Shark ${shark.color}")
    println("Plecostomus ${plecostomus.color}")
}

fun main(){
    // buildAquarium()
    makeFish()
}