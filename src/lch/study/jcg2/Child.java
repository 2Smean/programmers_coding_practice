package lch.study.jcg2;

public class Child extends Parent{
    int x = 4000;
    Child(){
        this(5000);
    }

    Child(int x){
        this.x = x;
    }
}
