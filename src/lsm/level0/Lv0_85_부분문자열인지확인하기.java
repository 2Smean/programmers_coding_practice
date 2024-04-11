package lsm.level0;

public class Lv0_85_부분문자열인지확인하기 {
    public static void main(String[] args) {
        String str = "apple";
        String target = "pe";
        System.out.println(solution(str,target));
    }
    private static int solution(String str, String target) {
        int answer = 0;

        for(int i=0;i<str.length();i++){
            if(str.contains(target)){
                return 1;
            }
        }
        return answer;
    }
}
