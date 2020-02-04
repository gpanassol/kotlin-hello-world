package example.myapp

//propriedades
abstract class AquariumFish {
    abstract val color: String
}

//comportamento
interface FishAction {
    fun eat()
}