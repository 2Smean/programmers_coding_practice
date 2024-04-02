package lsm.level0;
/*이중for문으로 접근했었는데 문자열 자체를 추가하면서 for문을 돌리면 가능하다*/
public class Lv0_62_문자열곱하기 {
    public static void main(String[] args) {
        String str = "hello";
        int k = 3;
        System.out.println(solution(str,k));
    }
    private static String solution(String str, int k) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < k; i++) {
            answer.append(str);
        }
        return answer.toString();
    }
}
