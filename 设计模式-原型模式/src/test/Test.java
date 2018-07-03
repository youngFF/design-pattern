package test;

import model.Prototype;
import model.Student;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student(123, "hyena");


        Prototype prototype = new Prototype(3, "hyena" , student);
        System.out.println(prototype);


        Object clone = prototype.clone();

        if (clone instanceof Prototype) {
            System.out.println(clone.toString());
        }

        System.out.println("在克隆对象修改student对象");
        Prototype cloned = (Prototype)clone ;

        cloned.getStudent().setName("after update");

        System.out.println(prototype);
        System.out.println(clone);
    }
}
