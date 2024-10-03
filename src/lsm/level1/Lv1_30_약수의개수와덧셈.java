package lsm.level1;

public class Lv1_30_약수의개수와덧셈 {

    private static int solution(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            if (Math.sqrt(i) == (int) Math.sqrt(i)) {
                sum -= i;
            } else {
                sum += i; 
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(24, 27));
    }
}
