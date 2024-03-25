package lch.lv1;

public class PCCP붕대감기 {
    public static void main(String[] args) {
        int[] bandage = {5,1,5};
        int health = 30;
        int[][] attacks = {{2,10},{9,15},{10,5},{11,5}};
        System.out.println(solution(bandage,health,attacks));
    }

    private static int solution(int[] bandage, int health, int[][] attacks) {
        int fit = health;
        int answer =0;
        int max = -1;

        for (int i = 0; i < attacks.length; i++) {
            max = Math.max(max,attacks[i][0]);
        }


        for (int i = 0; i < max; i++) {
            if(fit>=health){
                continue;
            }
            else {
                
            }
        }


        return answer;
    }
}
