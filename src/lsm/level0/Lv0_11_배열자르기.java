package lsm.level0;

import java.util.Arrays;

/*Arrays.copyOfRange() 메서드는 시작 인덱스부터 끝 인덱스까지의 범위를 복사합니다.
 이 때, 시작 인덱스는 포함되지만, 끝 인덱스는 포함되지 않습니다*/
public class Lv0_11_배열자르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int num1 = 2;
        int num2 = 6;
        System.out.println(Arrays.toString(solution(numbers,num1,num2)));
    }
    private static int[] solution(int[] numbers, int num1, int num2) {
        int[] destArray = Arrays.copyOfRange(numbers, num1, num2+1);
        return destArray;
    }
}