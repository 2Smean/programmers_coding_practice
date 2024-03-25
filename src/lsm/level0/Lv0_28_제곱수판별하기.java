package lsm.level0;
/*i * i == n 조건이 한 번도 충족되지 않으면 return 2;*/
public class Lv0_28_제곱수판별하기 {
    public static void main(String[] args) {
        int n = 144;
        System.out.println(solution(n));
    }
    private static int solution(int n) {
        int answer = 0;
        for(int i=1;i <= n;i++){
            if(i*i == n){
                return 1;
            }
        }
        return 2;
    }
}
