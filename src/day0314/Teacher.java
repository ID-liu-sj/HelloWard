package day0314;

public class Teacher extends Person{
    double salsry;
    Teacher(String name,int age,String address,double salsry){
        super(name ,age,address);
        this.salsry=salsry;
    }
    void sayHi(){
        System.out.println("我叫"+name+",今年"+age+",家住"+address+",工资为"+salsry);
    }
}
