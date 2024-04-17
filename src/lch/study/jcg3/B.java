package lch.study.jcg3;

public class B extends A{

    public void paint(){
        super.draw();
        System.out.println("C");
        this.draw();
    }

    public void draw(){
        System.out.println("D");
    }
}
