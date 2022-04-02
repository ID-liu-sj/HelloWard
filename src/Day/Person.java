package Day;

public class Person {//定义超类成员变量
    String name;
    int age;
    String sex;
    Person(String name,int age,String sex){//创建超类方法
        this.name=name;//给成员变量赋值
        this.age=age;
        this.sex=sex;
    }
    void sayHi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,性别"+sex);
    }

}
