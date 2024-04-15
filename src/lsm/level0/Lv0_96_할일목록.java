package lsm.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*boolean [] 배열은 true,false 값이 저장되어있다
* 부정연산자인 ! 를 통해서 반대의 값을 unFinished에 담아 출력했다*/
public class Lv0_96_할일목록 {
    public static void main(String[] args) {
        String[] todo = {"a", "b", "c", "d"};
        boolean[] finished = {};
        System.out.println(Arrays.toString(solution(todo,finished)));
    }
    private static String[] solution(String[] todo, boolean[] finished) {
        List<String> unFinished = new ArrayList<>();

        for(int i=0;i<todo.length;i++){
            if(!finished[i]){
                unFinished.add(todo[i]);
            }
        }

        String[] answer = new String[unFinished.size()];
        answer = unFinished.toArray(answer);
        return answer;
    }
}
