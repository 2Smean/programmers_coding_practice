package lch.study.jcg;

public class Car extends Vehicle{


    public Car(String val){
        name = super.name = val;
    }

    @Override
    public String getName(String val) {
        System.out.println("chlid1");
        return "Car name" + val;
    }

    public String getName(byte val[]){
        System.out.println("child2");
        return "Car name" + val;
    }
}
