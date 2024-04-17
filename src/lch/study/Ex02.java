package lch.study;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];


        for (int i = 0; i <5; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[(i+1)%5]);
        }
    }
}
