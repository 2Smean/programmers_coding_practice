package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_147_리스트자르기 {
    public static void main(String[] args) {
        int[] result1 = solution(3, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(Arrays.toString(result1));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        if (n == 1) {
            return Arrays.copyOfRange(num_list, 0, b + 1);
        } else if (n == 2) {
            return Arrays.copyOfRange(num_list, a, num_list.length);
        } else if (n == 3) {
            return Arrays.copyOfRange(num_list, a, b + 1);
        } else if (n == 4) {
            List<Integer> result = new ArrayList<>();
            for (int i = a; i <= b; i += c) {
                result.add(num_list[i]);
            }
            return result.stream().mapToInt(Integer::intValue).toArray();
        }

        return new int[0]; // 기본적으로 빈 배열 반환
    }
}
