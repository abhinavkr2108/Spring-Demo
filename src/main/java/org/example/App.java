package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        /**
         * Scope:
         * singleton: only one instance object is created as soon as the application is started
         * prototype: multiple instances - object is created only when it is requested (different objects)
         * can be configured in spring.xml file
         */
        Programmer p1 = (Programmer) context.getBean("programmer");
        System.out.println(p1.getSalary());
        p1.writeCode();
        Programmer p2 = (Programmer) context.getBean("programmer");
        System.out.println(p2.getSalary());
        p2.writeCode();

        /**
         * Setting values through setter (<property name="salary" value="1000"/>) in spring.xml
         * It calls the setSalary method (Setter Injection)
         */
        Programmer p3 = (Programmer) context.getBean("programmer");
        int salary = p3.getSalary();
        System.out.println("Salary: " + salary + " dollars");
        p3.writeCode(); // calls the writeCode method (Setter Injection) using ref in spring.xml

        Coder c1 = context.getBean("coder",Coder.class);
        System.out.println("Coder age: "+ c1.getAge()); // Setting values via constructor (Constructor Injection)
        c1.compileCode();

    }
}
