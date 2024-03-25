package lch.lv1;

import java.util.HashMap;


/**
 * (70/100)점
 */
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
        int maxTime = -1;
        for (int i = 0; i < attacks.length; i++) {
            maxTime = Math.max(maxTime,attacks[i][0]);
        }

        // 기술 시전 시간
        int time = bandage[0];

        // 초당 회복량
        int recovery_amount = bandage[1];

        // 추가 회복량
        int add_amount = bandage[2];

        // 연속 성공량
        int cnt = 0;


        HashMap<Integer,Integer> attackMap = new HashMap<>();

        for (int i = 0; i < attacks.length; i++) {
            attackMap.put(attacks[i][0], attacks[i][1]);
        }

        for (int i = 1; i <= maxTime; i++) {
            // 연속 성공량이 5 되면 0으로 초기화
            if (cnt == time) {
                fit += add_amount;
                cnt = 0;
            }
            //
            if(fit >= health) {
                fit = health;
            }

            if(attackMap.containsKey(i)){
                fit -= attackMap.get(i);
                if (fit < 0) return -1; // 캐릭터 사망
            }
            else {
                cnt++;
                fit += recovery_amount;
            }
        }

        return (fit <= 0) ? -1 : fit;
    }
}
