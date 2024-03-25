package lsm.level0;

public class Lv0_16_피자나눠먹기1 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }
        private static int solution(int n) {
            int answer = 0;
            int a=n/7;
            double b=n%7; //double과 int 모두 가능!

            if(0<b && b<7)
            {
                return a+1 ;
            }else if(b==0)
            {
                return a;
            }

            return answer;
        }
}
