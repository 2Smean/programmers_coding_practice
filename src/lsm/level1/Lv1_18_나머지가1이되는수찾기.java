package lsm.level1;

public class Lv1_18_나머지가1이되는수찾기 {

    private static int solution(int n) {
        // 2부터 n-1까지 순차적으로 나눠서 나머지가 1인 가장 작은 값 찾기
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                return x;  // 조건을 만족하는 x를 찾으면 반환
            }
        }
        return -1;  // 정상적인 입력에서는 이 부분에 도달하지 않음
    }

    public static void main(String[] args) {
        // 테스트 출력
        System.out.println(solution(12));
    }
}
