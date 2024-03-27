package lsm.level0;
/*문자열에 추가 할때에는 append를 이용해여 추가한다
* 질문*/
public class Lv0_34_암호해독 {
    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher,code));
    }
    private static String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for(int i = code - 1;i < cipher.length();i = i + code){
            answer.append(cipher.charAt(i));
        }
        return answer.toString();
    }
}
