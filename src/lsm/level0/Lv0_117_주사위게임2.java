package lsm.level0;

public class Lv0_117_주사위게임2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;
        System.out.println(solution(a,b,c));
    }
    private static int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        int base = a * a + b * b + c * c;
        int base2 = a * a * a + b * b * b + c * c * c;
        
        if(a == b && b == c){
            answer = sum * base * base2;
        } else if (a != b && b != c && a != c) {
            answer = sum;
        } else {
            answer = sum * base;
        }
        return answer;
    }
}
