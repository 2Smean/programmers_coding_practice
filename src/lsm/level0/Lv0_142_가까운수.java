package lsm.level0;

public class Lv0_142_가까운수 {

    public static void main(String[] args) {
        int[] array1 = {3, 10, 28};
        int n1 = 20;
        System.out.println(solution(array1, n1));
    }

    public static int solution(int[] array, int n) {
        int closest = array[0]; // 첫 번째 원소를 초기값으로 설정
        int minDifference = Math.abs(array[0] - n); // 초기 최소 차이 계산

        for (int i = 1; i < array.length; i++) {
            int currentDifference = Math.abs(array[i] - n);
            if (currentDifference < minDifference || (currentDifference == minDifference && array[i] < closest)) {
                closest = array[i];
                minDifference = currentDifference;
            }
        }

        return closest;
    }
}
