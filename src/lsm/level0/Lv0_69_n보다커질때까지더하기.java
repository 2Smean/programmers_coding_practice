package lsm.level0;

public class Lv0_69_n보다커질때까지더하기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 20;
        System.out.println(solution(numbers,n));
    }
    private static int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i=0;i<numbers.length;i++){
            answer = answer + numbers[i];
            if(answer > n){
                return answer;
            }
        }
        return answer;
    }
}
