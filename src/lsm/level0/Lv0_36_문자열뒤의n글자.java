package lsm.level0;
/*출력은 되는데 역순으로 돌리는게 뭔지 모르겠음*/
public class Lv0_36_문자열뒤의n글자 {
    public static void main(String[] args) {
        String str = "happybirthday";
        int n = 5;
        System.out.println(solution(str,n));
    }
    private static String solution(String str, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 && n > 0; i--) {
            answer.append(str.charAt(i));
            n--; // n이 0이 될 때까지만 반복
        }

        return answer.toString();
    }

}
