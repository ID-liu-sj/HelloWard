package day0314;

public class Student extends Person{
    String stuId;
    Student(String name,int age,String address,String stuId){
        super(name,age,address);
        this.stuId=stuId;
    }
    void sayHi(){
        System.out.println("我叫"+name+",今年"+age+",家住"+address+",学号为"+stuId);

    }
}
