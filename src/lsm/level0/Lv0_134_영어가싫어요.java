package lsm.level0;

import java.util.HashMap;
import java.util.Map;
public class Lv0_134_영어가싫어요 {

    public static void main(String[] args) {
        String test1 = "onetwothreefourfivesixseveneightnine";
        String test2 = "onefourzerosixseven";
        System.out.println(solution(test1)); // 123456789
        System.out.println(solution(test2)); // 14067
    }

    private static int solution(String numbers) {
        // 영어 단어와 숫자를 매핑하는 해시맵을 생성합니다.
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);

        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        // 주어진 문자열을 순회하면서 단어를 추출합니다.
        for (char ch : numbers.toCharArray()) {
            temp.append(ch);
            if (numberMap.containsKey(temp.toString())) {
                result.append(numberMap.get(temp.toString()));
                temp.setLength(0); // temp 초기화
            }
        }

        // 결과 문자열을 정수로 변환하여 반환합니다.
        return Integer.parseInt(result.toString());
    }
}
