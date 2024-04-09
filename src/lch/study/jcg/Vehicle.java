package lch.study.jcg;

abstract class Vehicle {
    String name;
    abstract public String getName(String val);

    public String getName(){
        return "Vehicle name : " + name;
    }
}
