package Day;

public class Student extends Person{//语法
    String stud;//定义特有的派生类成员变量
    Student(String name,int age,String sex,String stud){//继承超类成员变量
        super(name,age,sex);
    }
}
