package com.company;

/**
 * Created by uitschool JV on 1/30/2016.
 */
public interface Test
{
    int b =55;

    enum Enum_in_interface{A,B,C,};

    static void static_method_in_interface()
    {
        System.out.println("Hi from static!");
    }

    default void default_method_in_interface()
    {
        System.out.println("Hi from default method!");
    }

    class Class_in_interface
    {
        public void print()
        {
            System.out.println("Hi from class!");
        }
        interface Interface_in_interface{};
    }
}
