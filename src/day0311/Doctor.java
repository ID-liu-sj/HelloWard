package day0311;

public class Doctor extends Person {
    String level;
    Doctor(String name, int age, String sex, String level){
        super(name,age,sex);
        this.level=level;

    }

}
