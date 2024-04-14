package lsm.level0;
/*str 과 pat 을 소문자나 대문자로 바꾸고 포함되어있는지 확인하면 된다*/
public class Lv0_95_원하는문자열찾기  {
    public static void main(String[] args) {
        String str = "aaAA";
        String pat = "aaaaa";
        System.out.println(solution(str,pat));
    }
    private static int solution(String str, String pat) {
        int answer = 0;
        String lowerStr = str.toLowerCase();
        String lowerPat = pat.toLowerCase();

        for(int i=0;i<lowerStr.length();i++){
            if(lowerStr.contains(lowerPat)){
                return 1;
            }
        }
        return answer;
    }
}
