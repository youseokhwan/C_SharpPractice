package chap05.section6.composition

// 구성(Composition): 집합 관계와 거의 동일하지만 특정 클래스가 한 클래스의 부분이 되는 것
// Engine 클래스는 Car 클래스에 의존적임

class Car(val name: String, val power: String) {
    private var engine = Engine(power)

    fun startEngine() = engine.start()
    fun stopEngine() = engine.stop()
}

class Engine(power: String) {
    fun start() = println("Engine has been started.")
    fun stop() = println("Engine has been stopped.")
}

fun main() {
    val car = Car("tico", "100hp")
    car.startEngine()
    car.stopEngine()
}