package lsm.level0;

public class Lv0_116_간단한식계산하기 {
    public static void main(String[] args) {
        String bio = "43 + 12";
        System.out.println(solution(bio));
    }
    private static int solution(String binomial) {
        int answer = 0;
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        boolean check = false;
        char operator = ' ';

        for(int i=0;i<binomial.length();i++){
            char ch = binomial.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                operator = ch;
                check = true;
                continue;
            }
            if (ch != ' ') {
                if (check) {
                    b = b.append(ch);
                }else {
                    a = a.append(ch);
                }
            }
        }
        int integerA = Integer.parseInt(String.valueOf(a));
        int integerB = Integer.parseInt(String.valueOf(b));
        if(operator == '+') {
            answer = integerA + integerB;
        }else if (operator == '-') {
            answer = integerA - integerB;
        } else if (operator == '*') {
            answer = integerA * integerB;
        }
        return answer;
    }
}
