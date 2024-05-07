package lch.jordy.OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentMain {
    private static Map<Long,Student> map;
    public static void main(String[] args) {

        map = new HashMap<>();
        map.put(1L,new Student("이찬호"));

        List<Student> allStudents = findAllStudents();
        System.out.println("allStudents = " + allStudents);
    }
    private static List<Student> findAllStudents(){

        return new ArrayList<>(map.values());
    }
}
