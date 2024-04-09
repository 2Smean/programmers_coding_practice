package lch.study.jcg;

public class Car extends Vehicle{


    public Car(String val){
        name = super.name = val;
    }

    @Override
    public String getName(String val) {
        return "Car name" + val;
    }

    public String getName(byte val[]){
        return "Car name" + val;
    }
}
