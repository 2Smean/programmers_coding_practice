package lch.study.jcg;

abstract class Vehicle {
    String name;
    abstract public String getName(String val);

    public String getName(){
        System.out.println("1");
        return "Vehicle name : " + name;
    }
}
