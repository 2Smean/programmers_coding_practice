package lsm.level1;

import java.util.Scanner;

public class Lv1_28_직사각형별찍기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 두 개의 정수를 입력받습니다.
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 세로 길이 m만큼 반복
        for (int i = 0; i < m; i++) {
            // 가로 길이 n만큼 별 출력
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}
