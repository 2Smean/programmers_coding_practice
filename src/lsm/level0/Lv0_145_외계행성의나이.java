package lsm.level0;

public class Lv0_145_외계행성의나이 {

    public static void main(String[] args) {
        int age1 = 23;
        System.out.println(solution(age1)); // 
    }

    public static String solution(int age) {
        StringBuilder result = new StringBuilder();
        String ageStr = String.valueOf(age); // 숫자를 문자열로 변환

        for (char digit : ageStr.toCharArray()) {
            // 숫자 문자를 대응하는 알파벳으로 변환
            char letter = (char) ('a' + (digit - '0'));
            result.append(letter);
        }

        return result.toString();
    }
}
