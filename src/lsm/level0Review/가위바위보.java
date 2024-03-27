package lsm.level0Review;

import java.util.HashMap;

public class 가위바위보 {
    public static void main(String[] args) {
        String rsp = "205";
        System.out.println(solution(rsp));
    }

    private static String solution(String rsp) {

        String answ = "";

        HashMap<String,String> map = new HashMap<>();
        map.put("2","0");
        map.put("0","5");
        map.put("5","2");


        for (int i = 0; i < rsp.length(); i++) {
            if(map.containsKey(String.valueOf(rsp.charAt(i)))){
                answ += map.get(String.valueOf(rsp.charAt(i)));
            }
        }

        System.out.println(answ);


        return answ;
    }
}
