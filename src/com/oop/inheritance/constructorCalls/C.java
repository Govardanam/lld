package com.oop.inheritance.constructorCalls;

public class C extends B{
    public C(){
        System.out.println("C");
    }

    public C(String A, String B){
        System.out.println(A+B);
    }
}
