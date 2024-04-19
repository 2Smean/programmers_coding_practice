package lsm.level0;

public class Lv0_105_숫자찾기 {
    public static void main(String[] args) {
        int num = 123456;
        int k = 4;
        System.out.println(solution(num,k));
    }
    private static int solution(int num, int k) {
        int answer = 0;
        String sn = String.valueOf(num);
        String sk = String.valueOf(k);

        for(int i=0;i<sn.length();i++){
            if(sn.charAt(i) == sk.charAt(0)){
                return i + 1;
            }
        }
        return -1;
    }
}
