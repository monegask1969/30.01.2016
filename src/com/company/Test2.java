package com.company;

/**
 * Created by uitschool JV on 1/30/2016.
 */
public class Test2 {
    public String testfield = "(testfield!)";
    public static class Mynested
    {
        public String nested = "(nested!)";
        public void nestedshow()
        {
            System.out.println("Hi, I'm an vlozenii class!" + nested);
        }
    }
    public class Myinner
    {
        public String inner = "(inner!)";
        public void showinner()
        {
            System.out.println("Hi, I'm an vlozenii class!" + inner);
        }
    }
    public void show()
    {
        System.out.println("Hi, I'm just class!" + testfield);
    }
}
