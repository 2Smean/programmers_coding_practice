package lch.study.jcg2;

public class Child extends Parent{
    int x = 4000;
    Child(){
        this(5000);
        System.out.println("hi1");
    }

    Child(int x){
        this.x = x;
    }
}
