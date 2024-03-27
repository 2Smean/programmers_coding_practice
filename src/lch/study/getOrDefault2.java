package lch.study;

import com.sun.xml.internal.fastinfoset.util.StringIntMap;

import java.util.HashMap;
import java.util.Map;

public class getOrDefault2 {
    public static void main(String[] args) {

        String[] friends = {"muzi", "ryan", "frodo", "neo"};

        String[] gifts = {"muzi frodo", "muzi frodo",
                            "ryan muzi", "ryan muzi",
                            "ryan muzi", "frodo muzi",
                            "frodo ryan", "neo muzi"};
        System.out.println(solution(friends,gifts));
    }

    private static int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String,Map<String,Integer>> giftMap = new HashMap<>();
        for (String friend : friends) {
            giftMap.put(friend,new HashMap<>());
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String giver = parts[0];
            String receiver = parts[1];
            giftMap.get(giver).put(receiver,giftMap.get(giver).getOrDefault(receiver,0)+1);
        }
        System.out.println(giftMap);

        return answer;
    }
}
