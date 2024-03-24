package lch.lv1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 100/100
 */
public class 달리기경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(solution(players,callings));
    }

    private static String[] solution(String[] players, String[] callings) {
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i],i+1);
            map2.put(i+1,players[i]);
        }

        for (int i = 0; i < callings.length; i++) {
            String nowPlayer = callings[i];
            int nowPlayerRank = map.get(nowPlayer);

            int prePlayerRank = nowPlayerRank-1;
            String prePlayer = map2.get(prePlayerRank);

            map.put(nowPlayer,prePlayerRank);
            map.put(prePlayer,nowPlayerRank);

            map2.put(nowPlayerRank,prePlayer);
            map2.put(prePlayerRank,nowPlayer);
        }

        String[] answer = new String[map.size()];

        for (int i = 1; i < map.size(); i++) {
            answer[i-1] = map2.get(i);
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));


        return answer;
    }
}
