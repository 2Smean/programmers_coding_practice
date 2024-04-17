package lch.study.jcg2;

public class Parent {
    int x = 100;
      Parent(){
        this(500);
        System.out.println("hi2");
    }

    Parent(int x){
        this.x = x;
    }

    int getX(){
        return x;
    }
}
