package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*Array 를 List로 List를 Array 로 바꾸는 연습
* List의 저장된 요소의 갯수를 반환하는 것은 size() 이고
* List의 인덱스를 반환하는 것은 get()이다*/
public class Lv0_48_카운트업 {
    public static void main(String[] args) {
        int start = 3;
        int end = 10;
        System.out.println(Arrays.toString(solution(start,end)));
    }
    private static int[] solution(int start, int end) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=start;i<=end;i++){
            answerList.add(i);
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}
