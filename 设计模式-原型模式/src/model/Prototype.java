package model;

public class Prototype implements Cloneable {


    private int i ;
    private String name ;

    private Student student ;


    public Prototype(int i, String name, Student student) {
        this.student = student;
        this.i = i;
        this.name = name;
    }


    public Student getStudent() {
        return student;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //克隆新的对象
        Prototype clone = (Prototype) super.clone();
        // 改变clone对象的student引用指向
        clone.student = (Student) student.clone();
        return clone;
    }


    @Override
    public String toString() {
        return "Prototype{" +
                "i=" + i +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }
}
