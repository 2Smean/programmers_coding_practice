package lch.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 가장많이받은선물 {
    public static void main(String[] args) {

        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends,gifts));
    }

    private static int solution(String[] friends, String[] gifts) {
        HashMap<String,HashMap<String,Integer>> giftMap = new HashMap<>();
        HashMap<String,Integer> giveMap = new HashMap<>();
        HashMap<String,Integer> receiveMap = new HashMap<>();

        for (String friend : friends) {
            giftMap.put(friend,new HashMap<>());
            giveMap.put(friend,0);
            receiveMap.put(friend,0);
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];
            giftMap.get(giver).put(receiver,giftMap.get(giver).getOrDefault(receiver,0) + 1);
            giveMap.put(giver,giveMap.get(giver) + 1);
            receiveMap.put(receiver,receiveMap.get(receiver)+1);
        }

        System.out.println("giftMap = " + giftMap);

        for (String giver : friends) {
            for (String receiver : friends) {
                if(!giver.equals(receiver)){
                    System.out.print(receiver + "/");
                }
            }
            System.out.println();
        }

        return 0;
    }
}
