package lsm.level0;

public class Lv0_22_배열의평균값 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(solution(numbers));
    }
    private static double solution(int[] numbers) {
        double answer = 0;
        int sum=0;
        for(int i=0;i<numbers.length;i++)
        {
            sum+=numbers[i];
        }
        answer=(double)sum/numbers.length;

        return answer;
    }
}
