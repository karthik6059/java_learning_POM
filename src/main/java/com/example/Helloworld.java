package com.example;

public class Helloworld extends Main{
    String value="child";

    @Override
    public void sound(){
        System.out.println("From child class");
    }

public static void main(String[] args) {

    Main hw = new Helloworld();
    System.out.println(hw.value);
    hw.sound();
        
    }
}
