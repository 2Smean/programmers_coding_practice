package lch.study.jcg3;

public class A {

    public void paint(){
        System.out.println("A");
        draw();
    }

    public void draw(){
        System.out.println("B");
        draw();
    }
}
