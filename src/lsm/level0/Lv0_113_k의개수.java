package lsm.level0;

public class Lv0_113_k의개수 {
    public static void main(String[] args) {
        int i = 1;
        int j = 13;
        int k = 1;
        System.out.println(solution(i,j,k));
    }
    private static int solution(int i, int j, int k) {
        int answer = 0;

        for(int n=i;n<=j;n++){
            String strN = String.valueOf(n);
            for(int idx=0;idx<strN.length();idx++){
                char ch = strN.charAt(idx);
                if(ch == (char)(k + '0')){
                    answer++;
                }
            }
        }
        return answer;
    }
}
