package lsm.level0;

public class Lv0_109_369게임 {
    public static void main(String[] args) {
        int order = 3;
        System.out.println(solution(order));
    }
    private static int solution(int order) {
        String orderString = String.valueOf(order);

        int answer = 0;

        for(int i=0;i<orderString.length();i++){
            char ch = orderString.charAt(i);
            if(ch == '3' || ch == '6' || ch == '9'){
                answer++;
            }
        }
        return answer;
    }
}
