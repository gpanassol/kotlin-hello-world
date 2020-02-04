package example.myapp

class Plecostomus: AquariumFish(), FishAction {
    override val color = "gold"

    override fun eat() {
        println("eat algae")
    }
}