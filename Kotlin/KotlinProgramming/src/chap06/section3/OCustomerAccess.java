package chap06.section3;

public class OCustomerAccess {
    public static void main(String[] args) {
        String name = OCustomer.INSTANCE.getName(); // INSTANCE를 통해 코틀린 object 선언 객체의 메서드 접근
        System.out.println(name);
    }
}
