package lsm.level1;

public class Lv1_17_음양더하기 {

    private static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        // absolutes와 signs 배열의 길이가 같으므로 반복문을 통해 처리
        for (int i = 0; i < absolutes.length; i++) {
            // signs[i]가 true이면 양수, false이면 음수로 처리
            if (signs[i]) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        // 테스트 출력
        System.out.println(solution(new int[] {1, 2, 3}, new boolean[] {false, false, true})); 
    }
}
