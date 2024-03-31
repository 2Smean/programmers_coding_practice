package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*배열 전체를 Arrays.sort 로 오름차순 정리 후 for 문에서 i를 5로 조건을 두면
* 5이하의 것들을 제외하고 값을 넣는다*/
public class Lv0_57_뒤에서5등위로 {
    public static void main(String[] args) {
        int[] list = {4, 2, 1, 12, 44, 54, 66, 43};
        System.out.println(Arrays.toString(solution(list)));
    }
    private static int[] solution(int[] list) {
        List<Integer> answerList = new ArrayList<>();

        Arrays.sort(list);
        for(int i=5;i<list.length;i++){
            answerList.add(list[i]);
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
