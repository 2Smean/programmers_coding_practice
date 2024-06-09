package lsm.level0;

public class Lv0_126_1로만들기 {
    public static void main(String[] args) {
        int[] numList = {12, 4, 15, 1, 14};
        System.out.println(solution(numList));
    }
    private static int solution(int[] numList) {
        int count = 0;

        for (int i = 0; i < numList.length; i++) {
            int number = numList[i];
            for (; number > 1; count++) {
                if (number % 2 == 0) {
                    number = number / 2;
                } else {
                    number = (number - 1) / 2;
                }
            }
        }
        return count;
    }
}
