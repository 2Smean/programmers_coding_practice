package lsm.level0;

public class Lv0_81_인덱스바꾸기 {
    public static void main(String[] args) {
        String str = "i love you";
        int num1 = 1;
        int num2 = 5;
        System.out.println(solution(str,num1,num2));
    }
    private static String solution(String str, int num1, int num2) {
        char[] charArray = str.toCharArray();//charater 로 변경

        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        String answer = new String(charArray);//다시 문자열로 변경
        return answer;
    }
}
