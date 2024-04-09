package lch.study;



public class StaticAbout {
    public static void main(String[] args) {

        int a = 10;
        Static.b = a;
        Static st = new Static();

        System.out.println(Static.b++); //10
        System.out.println(st.b); //11
        System.out.println(a); // 10
        System.out.println(st.a); // 20
    }
}
