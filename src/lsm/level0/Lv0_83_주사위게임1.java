package lsm.level0;
/*절대값을 추출하기 위해서는 Math.abs 를 사용한다
* abs 는 absolute(순수한)이라는 뜻이다.*/
public class Lv0_83_주사위게임1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.println(solution(a,b));
    }
    private static int solution(int a, int b) {
        int answer = 0;
        int allOdd = (a*a)+(b*b);
        int justOne = 2 * (a+b);
        int allEven = Math.abs(a-b);

        if(a % 2 != 0){
            if(b % 2 != 0){
                answer = allOdd;
            }else{
                answer = justOne;
            }
        }else{
            if(b % 2 == 0){
                answer = allEven;
            }else{
                answer = justOne;
            }
        }
        return answer;
    }
}
