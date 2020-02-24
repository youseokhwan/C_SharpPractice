package chap05.section6

// 집합(Aggregation): 연관 관계와 비슷하지만 소유 개념 존재
// 연못은 여러 오리를 소유할 수 있지만 오리는 여러 연못에 있을 수 없음

class Pond(_name: String, _members: MutableList<Duck>) {
    val name: String = _name
    val members: MutableList<Duck> = _members
    constructor(_name: String): this(_name, mutableListOf<Duck>())
}

class Duck(val name: String) {
    fun main() {
        val pond = Pond("myFavorite")
        val duck1 = Duck("Duck1")
        val duck2 = Duck("Duck2")

        pond.members.add(duck1)
        pond.members.add(duck2)

        for(duck in pond.members) {
            println(duck.name)
        }
    }
}