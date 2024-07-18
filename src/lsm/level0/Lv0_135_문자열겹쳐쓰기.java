package lsm.level0;

public class Lv0_135_문자열겹쳐쓰기 {

    public static void main(String[] args) {
        String my_string1 = "He11oWor1d";
        String overwrite_string1 = "lloWorl";
        int s1 = 2;
        System.out.println(solution(my_string1, overwrite_string1, s1));
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder result = new StringBuilder();

        // my_string의 앞부분을 추가
        result.append(my_string.substring(0, s));
        // overwrite_string을 추가
        result.append(overwrite_string);
        // my_string의 뒷부분을 추가
        result.append(my_string.substring(s + overwrite_string.length()));

        return result.toString();
    }
}
