package lsm.level0;

public class Lv0_144_9로나눈나머지 {

    public static void main(String[] args) {
        String number1 = "123";
        System.out.println(solution(number1));
    }

    public static int solution(String number) {
        int sum = 0;
        for (char digit : number.toCharArray()) {
            sum += digit - '0'; // 문자 '0'의 아스키 값을 빼서 실제 숫자 값으로 변환
        }
        return sum % 9; // 합을 9로 나눈 나머지 반환
    }
}
