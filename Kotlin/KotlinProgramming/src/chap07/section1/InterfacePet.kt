package chap07.section1

interface Pet {
    var category: String
    val msgTags: String // val 키워드는 getter 구현 가능
        get() = "I'm your lovely pet!"

    var species: String
    fun feeding()

    // 코틀린 및 java default 키워드에서는 인터페이스에서도 구현부를 추가할 수 있다.
    fun patting() {
        println("Keep patting!")
    }
}

// 코틀린에서는 extends, implements 키워드 없이 콜론(:)으로 통일
class Cat(name: String, override var category: String) : Pet, Animal(name) {
    override var species: String = "cat"
    override fun feeding() {
        println("Feed the cat a tuna can!")
    }
}

fun main() {
    val obj = Cat("Coco", "small")
    println("Pet Category: ${obj.category}")
    obj.feeding()
    obj.patting()
}