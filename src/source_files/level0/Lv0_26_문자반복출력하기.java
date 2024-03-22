package source_files.level0;

public class Lv0_26_문자반복출력하기 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 2;
        System.out.println(solution(my_string,n));
    }
    private static String solution(String my_string, int n) {
        String answer = "";
        for(int i=0;i<=my_string.length()-1;i++){
            for(int j=0;j<=n-1;j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
