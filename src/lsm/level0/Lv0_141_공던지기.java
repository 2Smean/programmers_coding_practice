package lsm.level0;

public class Lv0_141_공던지기 {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3, 4};
        int k1 = 2;
        System.out.println(solution(numbers1, k1));
    }

    public static int solution(int[] numbers, int k) {
        int length = numbers.length;
        // 공을 던질 위치 계산: (k-1) * 2 % length
        int position = (k - 1) * 2 % length;
        return numbers[position];
    }
}
