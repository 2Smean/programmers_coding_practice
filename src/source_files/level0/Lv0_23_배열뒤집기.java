package source_files.level0;

import java.util.Arrays;

public class Lv0_23_배열뒤집기 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(num_list)));
    }
    private static int[] solution(int[] num_list) {
        int[] reverse = new int[num_list.length];
        for(int i=0; i<=num_list.length-1; i++) {
            reverse[i] = num_list[num_list.length-1-i];
        }
        return reverse;
    }
}
