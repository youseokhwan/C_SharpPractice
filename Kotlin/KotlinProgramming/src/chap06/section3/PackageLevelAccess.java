package chap06.section3;

public class PackageLevelAccess {
    public static void main(String[] args) {
//        PackageLevelFunctionKt.packageLevelFunc(); // 자동 생성된 이름
        PKLevel.packageLevelFunc(); // 직접 지정한 이름
    }
}
