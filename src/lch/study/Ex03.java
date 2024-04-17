package lch.study;

import org.w3c.dom.ls.LSOutput;

public class Ex03 {

    public static void main(String[] args) {
        int[] arr = {73,95,82};

        int sum = 0;

        for (int i : arr) {
            sum += i;
        }


        switch (sum/30){
            case 10 :
            case 9:
                System.out.println("A");
            case 8:
                System.out.println("B");
            case 7:
            case 6:
                System.out.println("C");
            default:
                System.out.println("D");
        }
    }
}
