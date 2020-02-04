package example.myapp

class Shark: FishAction, FishColor{
    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }
}