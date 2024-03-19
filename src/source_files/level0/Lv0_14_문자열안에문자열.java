package source_files.level0;
/*class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        for(int i=0;i<str1.length();i++){
            if(str1.equals(str2)){
                answer = 1;
            }else{
                answer = 2;
            }
        }
        return answer;
    }
}
이는 처음에 풀었던 방식인데 str1.equals(str2)를 하게되면
각각의 모든 문자열에 대해서 비교하는 것이 아니라,
단순히 두 문자열이 서로 같은지를 확인하는 조건이므로
*/
public class Lv0_14_문자열안에문자열 {
    public static void main(String[] args) {
        String str1 = "adfwerdsf";
        String str2 = "ad";
        System.out.println(solution(str1,str2));
    }

        private static int solution(String str1, String str2) {
            int answer = 0;
            for(int i=0;i<str1.length();i++){
                if(str1.equals(str2)){
                    answer = 1;
                }else{
                    answer = 2;
                }
            }
            return answer;
        }

}
