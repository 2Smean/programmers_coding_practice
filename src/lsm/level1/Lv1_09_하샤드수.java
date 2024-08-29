package lsm.level1;

public class Lv1_09_하샤드수 {

    private static boolean solution(int x) {
        // x의 자릿수 합을 구합니다.
        int sumOfDigits = 0;
        int originalX = x;

        while (x > 0) {
            sumOfDigits += x % 10;  // 마지막 자릿수를 더합니다.
            x /= 10;  // 마지막 자릿수를 제거합니다.
        }

        // 원래 숫자가 자릿수의 합으로 나누어 떨어지는지 확인합니다.
        return (originalX % sumOfDigits == 0);
    }

    public static void main(String[] args) {
        int x = 14;
        System.out.println(solution(x));
    }
}
