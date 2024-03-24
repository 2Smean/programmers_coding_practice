package lch.lv1;

import java.util.*;

/**
 * 90/100
 */
public class PCCE기출문제10 {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80},
                        {2, 20300804, 847, 37},
                        {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        System.out.println(solution(data,ext,val_ext,sort_by));
    }

    private static int[][] solution(int[][] data, String ext, int valExt, String sortBy) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);

        int key = 0;
        int sorted = 0;

        for (String s : map.keySet()) {
            if(s.equals(ext)) {
                key = map.get(s);
            }
            else if(s.equals(sortBy)){
                sorted = map.get(s);
            }
        }

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            if(data[i][key] < valExt){
                list.add(data[i]);
            }
        }

        final int sortedValue = sorted;
        Collections.sort(list,Comparator.comparingInt(a->a[sortedValue]));


        int[][] answer = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
