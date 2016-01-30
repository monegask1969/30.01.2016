package com.company;

/**
 * Created by uitschool JV on 1/30/2016.
 */
public class main_to_Test2 {
    public static void main(String[] args) {
        Test2 a = new Test2();
        a.show();
        Test2.Mynested a1 = new Test2.Mynested();
        a1.nestedshow();
        Test2.Myinner a2 = a.new Myinner();
        Test2.Myinner a3 = a.new Myinner();
        a2.showinner();
        a3.showinner();
    }
}
