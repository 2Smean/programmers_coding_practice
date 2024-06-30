package lch.kongTest;

import java.util.HashMap;
import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int answer = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if(set.size() < answer) return set.size();

        return answer;
    }
}
