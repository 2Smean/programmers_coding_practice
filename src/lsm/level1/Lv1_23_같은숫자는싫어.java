package lsm.level1;

import java.util.ArrayList;

public class Lv1_23_같은숫자는싫어 {

    private static int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(); // 결과를 담을 리스트

        // 첫 번째 원소는 무조건 추가
        list.add(arr[0]);

        // 배열을 순차적으로 탐색하면서 중복된 숫자 제거
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }

        // 리스트를 배열로 변환하여 반환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    // 배열을 출력하는 헬퍼 함수
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        // 결과 출력
        printArray(solution(arr1)); // [1, 3, 0, 1]
        printArray(solution(arr2)); // [4, 3]
    }
}
