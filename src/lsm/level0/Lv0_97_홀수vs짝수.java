package lsm.level0;

public class Lv0_97_홀수vs짝수 {
    public static void main(String[] args) {

    }
    private static int solution(int[] list) {
        int answer = 0;
        int odd = 0;
        int even = 0;

        for(int i=0;i<list.length;i++){
            if(i % 2 == 0){
                odd += list[i];
            }else{
                even += list[i];
            }
        }

        answer = odd > even ? odd : even;

        return answer;
    }
}
