package lsm.level0;
/*[0단계] 머쓱이보다 키큰사람*/
public class Lv0_04_머쓱이보다키큰사람 {
    public static void main(String[] args) {
        int[] array = {156, 158, 160, 170, 180};
        int height = 159;
        System.out.println(solution(array,height));
    }
    private static int solution(int[] array, int height) {
        int answer = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]>height){
                answer++;
            }
        }
        return answer;
    }
}
