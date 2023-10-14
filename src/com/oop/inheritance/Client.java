package com.oop.inheritance;

import com.oop.inheritance.constructorCalls.D;

public class Client {

    public static void main(String[] args) {
        Student s = new Student();
        s.name="govardanam";
        s.psp=Integer.parseInt("90");
        //s.logging();
        //System.out.println("User "+s.name+" "+"PSP "+s.psp);
        D d = new D();
    }
}
