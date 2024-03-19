package source_files.level0;

import java.util.Arrays;

public class Lv0_10_짝수홀수개수 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(num_list)));
    }
    private static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        for(int i = 0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                x++;
            }else{
                y++;
            }
            answer[0]=x;
            answer[1]=y;
        }
        return answer;
    }
}
