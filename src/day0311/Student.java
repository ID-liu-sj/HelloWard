package day0311;

public class Student extends Person {
    String stuld;
    Student(String name, int age , String sex, String stuld){
        super(name,age,sex);
        this.stuld=stuld;
    }
    void sayHi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁,性别"+sex+"学号为"+stuld);
    }
}

