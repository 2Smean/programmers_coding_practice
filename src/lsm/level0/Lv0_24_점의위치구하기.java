package lsm.level0;

public class Lv0_24_점의위치구하기 {
    public static void main(String[] args) {
        int[] dot = {2, 4};
        System.out.println(solution(dot));
    }
    private static int solution(int[] dot) {
        int answer = 0;
        int x=dot[0];
        int y=dot[1];
        if(x<0 && y>0){
            answer=2;
        }else if(x<0 && y<0){
            answer=3;
        }else if(x>0 && y<0){
            answer=4;
        }else
            answer=1;
        return answer;
    }
}
