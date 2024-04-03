package lsm.level0;

public class Lv0_66_두연산비교하기 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(solution(a,b));
    }
    private static int solution(int a, int b) {
        int answer = 0;

        int product = 2 * a * b;

        String add = ""+a+b;
        int add2 = Integer.parseInt(add);

        if(add2 == product){
            return add2;
        }
        else if(add2>product){
            return add2;
        }else{
            return product;
        }
    }
}
