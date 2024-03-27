package lch.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class 가장많이받은선물 {
    public static void main(String[] args) {

        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends,gifts));
    }

    private static int solution(String[] friends, String[] gifts) {

        // 누가 누구에게 몇번의 선물을 주었는지 이중 해시맵
        HashMap<String,HashMap<String,Integer>> giftMap = new HashMap<>();

        // 준 선물 수 - 받은 선물 수 = 선물지수
        HashMap<String,Integer> giftScore = new HashMap<>();


        HashMap<String,Integer> nextMonthGift = new HashMap<>();

        for (String friend : friends) {
            giftMap.put(friend,new HashMap<>());
            giftScore.put(friend,0);
            nextMonthGift.put(friend,0);
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];
            giftMap.get(giver).put(receiver,giftMap.get(giver).getOrDefault(receiver,0) + 1);
            giftScore.put(giver,giftScore.get(giver)+1);
            giftScore.put(receiver, giftScore.get(receiver)-1);
        }

        System.out.println("giftScore = " + giftScore);

        for (String giver : friends) {
            for (String receiver : friends) {
                if(!giver.equals(receiver)){
                    int gift = giftMap.get(giver).getOrDefault(receiver,0);
                    int receive = giftMap.get(receiver).getOrDefault(giver,0);
                    if(gift>receive){
                        nextMonthGift.put(giver, nextMonthGift.get(giver)+1);
                    }
                    else if (gift == receive && giftScore.get(giver) > giftScore.get(receiver)){
                        nextMonthGift.put(giver, nextMonthGift.get(giver)+1);
                    }
                }
            }
            System.out.println();
        }
        return Collections.max(nextMonthGift.values());
    }
}
