package lsm.level0;

public class Lv0_33_공배수 {
    public static void main(String[] args) {
        int number = 60;
        int n = 2;
        int m = 3;
        System.out.println(solution(number,n,m));
    }
    private static int solution(int number, int n, int m) {
        int answer = 0;
        if(number % n != 0){
            answer = 0;
        }else{
            answer = 1;
        }
        return answer;
    }
}
