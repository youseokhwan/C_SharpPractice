public class Main {

    public static void main(String[] args) {
        System.out.println(convertHangul("425411"));
        System.out.println(convertHangul("10"));
        System.out.println(convertHangul("411"));
        System.out.println(convertHangul("425410001"));
    }

    static String convertHangul(String money) {
        String[] han1 = {"", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
        String[] han2 = {"", "십", "백", "천"};
        String[] han3 = {"", "만", "억", "조", "경"};
        StringBuilder result = new StringBuilder();
        int len = money.length();

        for (int i = len-1; i >= 0; i--) {
            int j = Integer.parseInt(money.substring(len-i-1, len-i));

            if (i == 0 || j != 1)
                result.append(han1[j]);
            if (j > 0)
                result.append(han2[i%4]);
            if (i % 4 == 0)
                result.append(han3[i/4]);
        }

        return result.toString();
    }
}