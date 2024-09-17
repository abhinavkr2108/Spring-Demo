package org.example;

import java.beans.ConstructorProperties;

public class Coder {
    private int age;
    private Computer computer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void compileCode() {
        computer.compileCode();
        System.out.println("Coder compiles code");
    }
}
