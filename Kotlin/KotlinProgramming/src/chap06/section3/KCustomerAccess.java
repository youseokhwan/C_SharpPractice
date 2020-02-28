package chap06.section3;

public class KCustomerAccess {

    public static void main(String[] args) {
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login(); // 애너테이션이 없으면 Companion에 직접 접근

        // KJob에 대한 객체 생성 후 접근
        KJob kjob = KCustomer.JOB;
        System.out.println(kjob.getTitle());

        // KCustomer를 통한 접근
        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
