package chap06.section3

class KCustomer {
    companion object {
        const val LEVEL = "INTERMEDIATE" // const는 val과 다르게 Compile Time에 값을 할당함(Java에서 접근하기 위해 사용)
        @JvmStatic fun login() = println("Login...") // Java에서 companion object에 접근하려면 @JvmStatic 애너테이션 사용
        @JvmField val JOB = KJob() // 특정 자료형을 표현하기 위한 애너테이션
    }
}

class KJob {
    var title: String = "Programmer"
}