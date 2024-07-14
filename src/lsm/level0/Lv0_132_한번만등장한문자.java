package lsm.level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lv0_132_한번만등장한문자 {

    public static void main(String[] args) {
        String s = "abcdabc";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // 각 문자의 빈도를 계산
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // 한 번만 등장하는 문자들을 저장할 리스트
        List<Character> uniqueChars = new ArrayList<>();
        for (char ch : frequencyMap.keySet()) {
            if (frequencyMap.get(ch) == 1) {
                uniqueChars.add(ch);
            }
        }

        // 리스트를 사전 순으로 정렬
        Collections.sort(uniqueChars);

        // 결과를 문자열로 변환
        StringBuilder result = new StringBuilder();
        for (char ch : uniqueChars) {
            result.append(ch);
        }

        return result.toString();
    }
}
