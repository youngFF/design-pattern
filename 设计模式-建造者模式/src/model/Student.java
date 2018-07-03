package model;


/**
 * 一个Student类：必要的信息name , id
 *
 * 可选的信息有： email ， location ， hobby
 *
 * 使用构造链的方法构件对象
 */
public class Student {

    //必要信息
    private String name ;
    private int id ;


    // 非必要信息
    private String email ;
    private String location ;
    private String hobby ;


    public Student(String name, int id) {
        this.name = name ;
        this.id = id ;
    }


    public Student setEmail(String email) {
        this.email = email ;
        return this ;
    }


    public Student setLocation(String location) {
        this.location = location;
        return this ;
    }

    public Student setHobby(String hobby) {
        this.hobby = hobby ;
        return this ;
    }







}
