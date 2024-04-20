package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lv0_107_문자열잘라서정리하기 {
    public static void main(String[] args) {
        String str = "axbaxc";
        System.out.println(Arrays.toString(solution(str)));
    }
    private static String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        String[] result;

        // "x"를 기준으로 문자열을 자르고 빈 문자열은 제외
        String[] splitArray = myString.split("x", -1);
        for (String s : splitArray) {
            if (!s.equals("")) {
                list.add(s);
            }
        }

        // 리스트를 배열로 변환
        result = new String[list.size()];
        result = list.toArray(result);

        // 배열을 사전순으로 정렬
        Arrays.sort(result);

        return result;
    }
}
