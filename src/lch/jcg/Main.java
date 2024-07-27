package lch.jcg;

import javafx.scene.Parent;

public class Main {
    public static void main(String[] args) {
        Obj obj = new Obj(3);
        obj.a = 5;

        int calculate = obj.calculate();
        System.out.println("calculate = " + calculate);
    }
}
