package lsm.level1;

public class Lv1_22_이상한문자만들기 {

    private static String solution(String s) {
        String[] words = s.split(" ", -1);  // 공백 기준으로 문자열을 나눕니다.
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder transformedWord = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (j % 2 == 0) {
                    transformedWord.append(Character.toUpperCase(c));  // 짝수 인덱스: 대문자
                } else {
                    transformedWord.append(Character.toLowerCase(c));  // 홀수 인덱스: 소문자
                }
            }

            result.append(transformedWord);
            if (i < words.length - 1) {
                result.append(" ");  // 단어 사이에 공백 추가
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "try hello world";
        System.out.println(solution(input));
    }
}
