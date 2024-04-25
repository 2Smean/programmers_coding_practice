package lsm.level0;

public class Lv0_111_문자리스트를문자열로변환하기 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        System.out.println(solution(arr));
    }
    private static String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            answer.append(arr[i]);
        }

        return answer.toString();
    }
}
