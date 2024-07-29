package lsm.level0;

import java.util.HashMap;
import java.util.Map;

public class Lv0_146_문자열묶기 {
    public static void main(String[] args) {
        String[] strArr1 = {"a", "bc", "d", "efg", "hi"};
        System.out.println(solution(strArr1));
    }
    public static int solution(String[] strArr) {
        // 각 문자열 길이별로 카운트할 맵을 초기화
        Map<Integer, Integer> lengthCountMap = new HashMap<>();

        // 각 문자열의 길이를 카운트
        for (String str : strArr) {
            int length = str.length();
            lengthCountMap.put(length, lengthCountMap.getOrDefault(length, 0) + 1);
        }

        // 가장 많은 문자열이 속한 길이 그룹의 크기를 찾음
        int maxGroupSize = 0;
        for (int count : lengthCountMap.values()) {
            if (count > maxGroupSize) {
                maxGroupSize = count;
            }
        }

        return maxGroupSize;
    }
}
