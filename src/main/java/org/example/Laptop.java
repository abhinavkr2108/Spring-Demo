package org.example;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop object is created");
    }


    @Override
    public void compileCode() {
        System.out.println("Laptop compiles code");
    }
}
