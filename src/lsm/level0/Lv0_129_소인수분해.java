package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_129_소인수분해 {

    public static void main(String[] args) {
        int n = 12;
        System.out.println(Arrays.toString(solution(n)));
    }
    private static int[] solution(int n) {
        List<Integer> factors = new ArrayList<>();

        // 2부터 n까지 나눌 수 있는 숫자를 찾음
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!factors.contains(i)) {
                    factors.add(i);
                }
                n /= i;
            }
        }

        // List를 배열로 변환
        int[] result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }

        return result;
    }
}
