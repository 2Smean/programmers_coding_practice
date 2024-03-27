package lch.study;

import java.util.HashMap;

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
