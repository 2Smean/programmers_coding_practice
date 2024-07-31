package lsm.level0;

public class Lv0_148_특정문자열로끝나가장문자열찾기 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
    }
    public static String solution(String myString, String pat) {
        // pat의 길이
        int patLength = pat.length();

        // myString의 끝에서부터 pat의 길이만큼 비교하며 찾기
        for (int i = myString.length() - patLength; i >= 0; i--) {
            if (myString.substring(i, i + patLength).equals(pat)) {
                return myString.substring(0, i + patLength);
            }
        }

        // 기본적으로 빈 문자열 반환 (이 경우는 입력 제한사항에 의해 발생하지 않음)
        return "";
    }
}
