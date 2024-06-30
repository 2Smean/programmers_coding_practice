package lch.kongTest;

import java.util.HashMap;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes =
                {{"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }

    private static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1],map.getOrDefault(clothes[i][1],0)+1);
        }

        for (String s : map.keySet()) {
            answer *= (map.get(s)+1);
        }

        return answer-1;

        //선글, 상의
        //(1, 2)
        // (1+1) * (2+1) - 1 = 5
        // 선글라스 1
        // 상의 1
        // 상의 1
        // 선글라스랑 - 상의 1
        // 선글라스랑 - 다른 상의 1

    }
}
