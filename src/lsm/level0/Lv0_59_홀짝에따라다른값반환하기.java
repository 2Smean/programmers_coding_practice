package lsm.level0;

public class Lv0_59_홀짝에따라다른값반환하기 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
    private static int solution(int n) {
        int answer = 0;
        if(n % 2 == 1){
            for(int i=1;i<=n;i=i+2){
                answer = answer + i;
            }
        }else{
            for(int i=2;i<=n;i=i+2){
                answer = answer + (i*i);
            }
        }

        return answer;
    }
}
