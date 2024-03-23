package source_files.level0;

public class Lv0_27_모음제거 {
    public static void main(String[] args) {
        String str = "leesm";
        System.out.println(solution(str));
    }
    private static String solution(String str) {
        String answer = "";
        for(int i=0;i < str.length();i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                answer += ch;
            }
        }
        return answer;
    }
}
