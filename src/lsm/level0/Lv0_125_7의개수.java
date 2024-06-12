package lsm.level0;

public class Lv0_125_7의개수 {

    public static void main(String[] args) {
        int[] array = {7, 77, 17};
        System.out.println(solution(array));
    }
    private static int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            String str = String.valueOf(i);
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }
}
