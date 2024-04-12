package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*반드시 boolean 을 사용해야하는가
* hashSet??*/
public class Lv0_87_배열의원소삭제하기 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete = {94, 777, 104, 1000, 1, 12};
        System.out.println(Arrays.toString(solution(arr,delete)));
    }
    private static int[] solution(int[] arr, int[] delete) {
        List<Integer> answerList = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            boolean isDelete = false;
            for(int j=0;j<delete.length;j++){
                if(arr[i] == delete[j]){
                    isDelete = true;
                    break;
                }
            }
            if(!isDelete){
                answerList.add(arr[i]);
            }
        }

        int[] answer = new int[answerList.size()];
        for(int i=0;i<answerList.size();i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
