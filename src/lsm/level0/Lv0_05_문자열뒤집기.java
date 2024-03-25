package lsm.level0;
/*[0단계] 문자열 뒤집기
    문자열의 길이를 얻을 때에는 length 뒤에 ()중괄호
*/
public class Lv0_05_문자열뒤집기 {

    public static void main(String[] args) {
        String my_string = "result";
        System.out.println(solution(my_string));
    }
    private static String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1;i>=0;i--){
            //문자열의 마지막 인덱스부터 첫번째 인덱스까지 반복
            answer += my_string.charAt(i);
            //문자열의 문자들을 역순으로 배치
        }
        return answer;
    }
}
