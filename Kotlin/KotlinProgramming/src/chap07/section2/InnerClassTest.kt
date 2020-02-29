package chap07.section2

interface Switcher {
    fun on(): String
}

class SmartPhone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb"
    }

    fun powerOn(): String {
        // 지역 클래스
        class Led(val color: String) {
            fun blink(): String = "Blinking $color on $model" // 외부 프로퍼티 접근 가능
        }
        val powerStatus = Led("Red")
        val powerSwitch = object : Switcher {
            override fun on(): String {
                return powerStatus.blink()
            }
        }
        return powerSwitch.on()
    }
}

fun main() {
    val mySdcard = SmartPhone("S7").ExternalStorage(32)
    println(mySdcard.getInfo())

    val myPhone = SmartPhone("Note9")
    myPhone.ExternalStorage(128)
    println(myPhone.powerOn())
}