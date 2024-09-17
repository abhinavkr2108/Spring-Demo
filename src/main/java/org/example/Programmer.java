package org.example;

public class Programmer {
    private int salary;
    private Computer computer;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Computer getLaptop() {
        return computer;
    }

    public void setLaptop(Computer computer) {
        this.computer = computer;
    }

    public void writeCode() {
        computer.compileCode();
        System.out.println("Programmer writes code");
    }
}
