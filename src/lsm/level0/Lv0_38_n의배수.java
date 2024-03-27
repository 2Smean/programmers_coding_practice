package lsm.level0;
/*너무 쉬운문제...*/
public class Lv0_38_n의배수 {
    public static void main(String[] args) {
        int num = 98;
        int n = 2;
        System.out.println(solution(98,2));
    }
    private static int solution(int num, int n) {
        int answer = 0;
        if(num % n == 0){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}
