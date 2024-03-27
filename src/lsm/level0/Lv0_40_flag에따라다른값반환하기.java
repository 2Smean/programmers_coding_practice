package lsm.level0;

public class Lv0_40_flag에따라다른값반환하기 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        boolean flag = true;
        System.out.println(solution(a,b,flag));
    }
    private static int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag==true){
            answer = a + b;
        }else{
            answer = a - b;
        }
        return answer;
    }
}
