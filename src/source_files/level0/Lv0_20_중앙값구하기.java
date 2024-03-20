package source_files.level0;

import java.util.Arrays;

/*array는 홀수 조건
  midIdx 는 idx 값인 0을 제외하므로 -1을 하고 array.length 를 절반으로 나눈다음
  나누게 되면 몫이 짝수이므로 1을 더해서 중앙 값을 구하여 비교함
  오류수정 -
  인줄알았으나 순서대로 정렬하기 위해서 Arrays.sort 를 사용하여 정렬하는 문제였다.*/
public class Lv0_20_중앙값구하기 {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7};
//        System.out.println(solution(array));
//    }
//    private static int solution(int[] array) {
//        int answer = 0;
//        int midIdx = (array.length-1)/2+1;
//        for(int i=0;i<array.length;i++){
//            if(array[i] == midIdx){
//                answer = array[i];
//            }
//        }
//        return answer;
//    }
public static void main(String[] args) {
    int[] array = {1,2,5,4,6,7,8};
    System.out.println(solution(array));
}
    private static int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int midIdx = array.length/2;
        answer = array[midIdx];
        return answer;
    }
}
