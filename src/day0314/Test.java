package day0314;

public class Test {
    public static void main(String[] args) {
        Person[]ps=new Person[5];
        ps[0]=new Student("l", 27, "tx", "111");
        ps[1]=new Student("sj", 25, "ts", "222");
        ps[2]=new Doctor("j", 52, "st", "主任医师");
        ps[3]=new Doctor("sl", 72, "xt", "副主任医师");
        ps[4]=new Teacher("lj", 57, "xs", 8888.8);
        for (int i=0;i< ps.length;i++){
            Person P=ps[i];
            System.out.println(P.name);
            P.sayHi();
        }










    }
}
