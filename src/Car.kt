class Car (val car_model: String) {
    var maxSpeed: Int = 0
    constructor(model: String, maxSpeed: Int): this(model){
        this.maxSpeed = maxSpeed
    }
    fun showInfo(){
        println("Car: Model = $car_model, Max Speed = $maxSpeed")
    }
}