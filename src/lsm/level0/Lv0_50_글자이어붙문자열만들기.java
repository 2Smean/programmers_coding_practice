package lsm.level0;

public class Lv0_50_글자이어붙문자열만들기 {
    public static void main(String[] args) {
        String str = "abcsefgh";
        int[] indexList = {1, 2, 3, 4, 5};
        System.out.println(solution(str,indexList));
    }
    private static String solution(String str, int[] indexList) {
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<indexList.length;i++){
            int idx = indexList[i];
            char ch = str.charAt(idx);
            answer.append(ch);
        }
        return answer.toString();
    }
}
