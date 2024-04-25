package lch.study.기출문제;

public class ex04 {
    public static void main(String[] args) {
        int number = 1234;
        int div = 10;
        int result = 0;

        while (number>0){
            result = result *div;
            result = result + number % div;
            number = number / div;
        }
        System.out.println("result = " + result);
    }
}
