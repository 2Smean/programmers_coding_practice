package lsm.level0;
/*10을 곱하는 이유는 숫자를 이어붙일 때 한칸 옆으로 밀어야해서*/
public class Lv0_46_이어붙인수 {
    public static void main(String[] args) {
        int[] num = {2, 3, 4, 5, 6};
        System.out.println(solution(num));
    }
    private static int solution(int[] num) {
        int answer = 0;
        int oddSum = 0;
        int evenSum = 0;
        for(int i=0;i<num.length;i++){
            if(num[i] % 2 == 1){
                oddSum = oddSum * 10 + num[i];
            }else{
                evenSum = evenSum * 10 + num[i];
            }
            answer = oddSum+evenSum;
        }
        return answer;
    }
}
