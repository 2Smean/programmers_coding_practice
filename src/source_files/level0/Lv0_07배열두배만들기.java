package source_files.level0;

import java.util.Arrays;

public class Lv0_07배열두배만들기 {
    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(solution(num_list)));
    }
    private static int[] solution(int[] num_list) {
        int[] doubleanswer = new int[num_list.length];
        for(int i=0; i<=num_list.length-1; i++) {
            doubleanswer[i] = num_list[i]*2;
        }
        return doubleanswer;
    }
}
