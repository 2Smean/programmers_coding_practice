package lsm.level0;

public class Lv0_41_첫번째로나오는음수 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, -1, 4, 5};
        System.out.println(solution(num_list));
    }
    private static int solution(int[] num_list) {
        int answer = 0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]<0){
                return i;
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}
