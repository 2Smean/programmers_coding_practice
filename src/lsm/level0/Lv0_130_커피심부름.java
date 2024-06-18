package lsm.level0;

public class Lv0_130_커피심부름 {
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        System.out.println(solution(order));
    }
    private static int solution(String[] order) {
        int answer = 0;
        int americano = 4500;
        int latte = 5000;

        for (String s : order) {
            if (s.contains("americano")) {
                answer += americano;
            } else if (s.contains("cafelatte")) {
                answer += latte;
            }else {
                answer += americano;
            }
        }

        return answer;
    }
}
