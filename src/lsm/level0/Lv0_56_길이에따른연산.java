package lsm.level0;

public class Lv0_56_길이에따른연산 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(solution(list));
    }
    private static int solution(int[] list) {
        int answer = 0;
        if(list.length >= 11){
            for(int i=0;i<list.length;i++){
                answer = answer + list[i];
            }
        }else{
            answer = 1;
            for(int i=0;i<list.length;i++){
                answer = answer * list[i];
            }
        }
        return answer;
    }
}
