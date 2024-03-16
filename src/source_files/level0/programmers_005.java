package source_files.level0;
/*[0단계] 문자열 뒤집기
    문자열의 길이를 얻을 때에는 length 뒤에 ()중괄호
*/
public class programmers_005 {
    public static void main(String[] args) {
        String my_string = "result";
        System.out.println(solution(my_string));
    }
    private static String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1;i>=0;i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
