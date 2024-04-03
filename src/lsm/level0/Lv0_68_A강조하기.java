package lsm.level0;
/*else 도 처리해줘야한다*/
public class Lv0_68_A강조하기 {
    public static void main(String[] args) {
        String str = "PrOgRaMmErS";
        System.out.println(solution(str));
    }
    private static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<str.length();i++){
            str = str.toLowerCase();
            char ch = str.charAt(i);
            if(ch == 'a'){
                answer.append('A');
            }else{
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
