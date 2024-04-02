package lch.lv2;

import java.util.Arrays;
import java.util.Stack;

public class 뒤에있는큰수찾기2 {
    public static void main(String[] args) {
        int[] numbers = {9, 1, 5, 3, 6, 2};
        System.out.println(solution(numbers));
    }

    private static int[] solution(int[] numbers) {

        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(answer,-1);

        // 첫번쨰 number 인덱스 stack 에 push
        stack.push(0);

        for (int i = 1; i < numbers.length; i++) {

            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
             answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        return answer;
    }
}
