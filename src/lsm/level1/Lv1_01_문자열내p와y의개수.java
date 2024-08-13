package lsm.level1;

public class Lv1_01_문자열내p와y의개수 {

        private static boolean solution(String s) {
            int count = 0;

            s = s.toLowerCase();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'p') {
                    count++;
                } else if (s.charAt(i) == 'y') {
                    count--;
                }
            }

            return count == 0;
        }


    public static void main(String[] args) {
        String s = "PpoiY";
        System.out.println(solution(s));
    }
}
