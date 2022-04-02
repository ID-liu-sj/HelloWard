package day0314;

public class Person {
    String name;
    int age;
    String address;
 Person(String name,int age,String address){
     this.name =name;
     this.age=age;
     this.address=address;
 }
 void sayHi(){
     System.out.println("我叫"+name+",今年"+age+",家住"+address);
 }
}
