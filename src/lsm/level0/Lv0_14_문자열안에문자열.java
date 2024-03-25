package lsm.level0;
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

+2024-03-20 추가

이 문제는 굳이 for문을 돌리는 것보다 Contains 을 활용해서 푸는 문제
앞으로 자주 쓰이니 잘 알아두자
Contains()란 ? 문자열이 특정 문자열을 포함하고 있는지 확인한다.
포함하고 있으면 true를, 아니면 false를 반환하며, 대소문자를 구분한다.
*/
public class Lv0_14_문자열안에문자열 {
    public static void main(String[] args) {
        String str1 = "adfwerdsf";
        String str2 = "ad";
        System.out.println(solution(str1,str2));
    }

    private static int solution(String str1, String str2) {
        int answer = 0;
        if(str1.contains(str2)){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }

}
