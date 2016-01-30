package com.company;

public class Main implements Test {

    public static void main(String[] args) {
        Enum_in_interface s = Enum_in_interface.C;
        System.out.println("Hi from interface!" + s);

        Test.static_method_in_interface();

        Test g = new Main();

        g.default_method_in_interface();

        Class_in_interface f = new Class_in_interface();
        f.print();

        int b = 50;
        System.out.println("B=" + b);

    }
}
