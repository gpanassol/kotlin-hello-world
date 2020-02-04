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
    shark.eat()

    println("Plecostomus ${plecostomus.color}")
    plecostomus.eat()
}

fun main(){
    // buildAquarium()
    //makeFish()

    val list = listOf(1,2,3,4,5)
    println(list.sum())

}