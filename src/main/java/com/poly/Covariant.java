package com.poly;

public class Covariant {
public static void main(String[] args){
        VarExample va = new VarExample();
        va.add(1,2);
    }
}

class Parent {
    Number getValue() { return 10; }
}

class Child extends Parent {
    Integer getValue() { return 10; }  // ✅ Covariant
}