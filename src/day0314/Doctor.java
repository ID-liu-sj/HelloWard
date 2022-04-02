package day0314;

public class Doctor extends Person{
    String level;
    Doctor(String name,int age ,String address,String level){
        super(name,age,address);
        this.level=level;
    }
    void sayHi(){
        System.out.println("我叫"+name+",今年"+age+",家住"+address+",等级为"+level);
    }
}
