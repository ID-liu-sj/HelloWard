package day0311;

public class Teacher extends Person {
    double salary;
    Teacher(String name, int age, String sex, double salary){
        super(name,age,sex);
        this.salary=salary;
        super.sayHi(name, age, sex, salary);
    }

}

