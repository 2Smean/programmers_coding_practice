package source_files.level0;

import java.util.Arrays;

public class Lv0_08_배열원소의길이 {
    public static void main(String[] args) {
        String[] strlist = {"hi", "my", "name", "is", "lsm"};
        System.out.println(Arrays.toString(solution(strlist)));
    }
    private static int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        for(int i=0;i<answer.length;i++){
            answer[i]=strlist[i].length();
        }
        return answer;
    }
}
