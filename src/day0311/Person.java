package day0311;

public class Person {
    String name;
    int age;
    String sex;
    Person(String name, int age, String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;

    }
    void sayHi(){

        System.out.println("大家好,我叫"+name+",今年"+age+"岁,性别"+sex);
    }
    void sayHi(String name, int age, String sex, double salary){
    }
}
