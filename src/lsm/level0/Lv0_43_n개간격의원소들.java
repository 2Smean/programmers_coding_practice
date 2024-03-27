package lsm.level0;

import java.util.*;
/*반환타입이 int []였는데 List<Integer>로 바꿔주었다.
* 리스트에 추가 할때는 add 로 추가
* 문자열에 추가할때는 append 로 추가*/
public class Lv0_43_n개간격의원소들 {
    public static void main(String[] args) {
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = 2;
        System.out.println(solution(num_list,n));
    }
    private static List<Integer> solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<num_list.length;i=i+n){
            answer.add(num_list[i]);
        }
        return answer;
    }
}
