package source_files.level0;

public class Lv0_21_짝수의합 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
    private static int solution(int n) {
        int answer = 0;
        for(int i=0;i<=n;i++){
            if(i%2==0)
                //answer=answer+i
                answer += i;
        }
        return answer;
    }
}
