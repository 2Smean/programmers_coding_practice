package lsm.level0;

public class Lv0_112_팩토리얼 {
    public static void main(String[] args) {
        int n = 3628800;
        System.out.println(solution(n));
    }
    private static int solution(int n) {
        int answer = 0;
        int factorial = 1;

        for(int i=1;i<=10;i++){
            factorial = factorial * i;

            if(factorial == n){
                answer = i;
                break;
            }else if(n < factorial){
                answer = (i-1);
                break;
            }
        }
        return answer;
    }
}
