package lsm.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        sb.setLength(0);
        sb.append("hello");
        sb.replace(1, 4, "ooo");
        sb.reverse();
        sb.insert(2, "()");
        sb.append("hi");
        System.out.println(sb);
    }
}
