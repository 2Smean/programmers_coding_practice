package lsm.level0Review;

public class 주사위 {
    public static void main(String[] args) {

        int[] box = {10,8,6};
        int n = 3;
        System.out.println(solution(box,n));
    }

    private static int solution(int[] box, int n) {

        int answer = 1;

        for (int num : box) {
            answer *= (num/n);
        }
        return answer;
    }
}
