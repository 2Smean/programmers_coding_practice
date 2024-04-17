package lch.study.jcg4;

public class Parent {
    int compute(int num){
        System.out.println("hi");
        if(num<=1) return num;
        return compute(num-1) + compute(num-2);
    }
}
