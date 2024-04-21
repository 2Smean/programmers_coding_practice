package lsm.level0;

public class Lv0_108_i로만들기 {
    public static void main(String[] args) {
        String str = "abcdevwxyz";
        System.out.println(solution(str));
    }
    private static String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < myString.length(); i++) {
            char currentChar = myString.charAt(i);
            if (currentChar < 'l') {
                sb.append('l');
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
