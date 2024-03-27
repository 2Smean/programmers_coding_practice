package lch.study;

import java.util.HashMap;
//이해가 바로 되었습니다 -승민-
public class getOrDefault {
    public static void main(String[] args) {
        String[] people = {"이승민","이찬호","공희진","공희진"};
        HashMap<String,Integer> map = new HashMap<>();

        for (String person : people) {
            map.put(person,map.getOrDefault(person,0) + 1);
        }

        System.out.println("map = " + map);
    }
}
