package lsm.level0;

public class Lv0_67_더크게합치기 {
    public static void main(String[] args) {
        int a = 23;
        int b = 43;
        System.out.println(solution(a,b));
    }
    private static int solution(int a, int b) {
        int answer = 0;
        String add = ""+a+b;
        int add2 = Integer.parseInt(add);
        String reverseAdd = ""+b+a;
        int reverseAdd2 = Integer.parseInt(reverseAdd);

        if(add2 == reverseAdd2){
            return add2;
        }else if(add2 > reverseAdd2){
            return add2;
        }else{
            return reverseAdd2;
        }

    }
}
