package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*배열을 List 에 담아야 contains 함수를 사용할 수 있다*/
public class Lv0_123_글자지우기 {
    public static void main(String[] args) {
        String str = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        System.out.println(solution(str,indices));
    }
    private static String solution(String str, int[] indices) {
        List<Integer> answerList = new ArrayList<>();
        StringBuilder answer = new StringBuilder();

        Arrays.sort(indices); // 정렬

        //이후 리스트에 담기
        for (int i = 0; i < indices.length; i++) {
            answerList.add(indices[i]);
        }

        for (int i = 0; i < str.length(); i++) {
            if (!answerList.contains(i)) {
                answer.append(str.charAt(i));
            }
        }

        return answer.toString();
    }
}
