package source_files.level0;

import java.util.Arrays;
/*이건 틀렸다 이유를 잘 모르겠음*/
public class Lv0_09_삼각형의완성조건 {
    public static void main(String[] args) {
        int[] sides = {3,2,6};
        System.out.println(solution(sides));
    }
    public static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[sides.length-1];
        int others = sides[0]+sides[1];
        if(max <= others){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}
