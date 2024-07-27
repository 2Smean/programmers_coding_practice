package lch.jcg;

public class Example {
    public static void main(String[] args) {
        int p = 1;
        for(int i = 0; i<5; i++, p*=i);
        System.out.println("p = " + p);
    }
}
