package lsm.level0;

public class Lv0_136_조건문자열 {

    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals(">")) {
            if (eq.equals("=")) {
                return n >= m ? 1 : 0;
            } else if (eq.equals("!")) {
                return n > m ? 1 : 0;
            }
        } else if (ineq.equals("<")) {
            if (eq.equals("=")) {
                return n <= m ? 1 : 0;
            } else if (eq.equals("!")) {
                return n < m ? 1 : 0;
            }
        }
        return 0; // 기본적으로 조건이 참이 아닌 경우 0을 반환
    }
}
