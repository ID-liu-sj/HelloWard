package day0310;

public class Studentclass {//创建一个Studentclass类
    String name;//定义成员变量
    int age ;
    String Address;

    Studentclass(String name, int age , String Address){//构造方法
         this.name = name;
         this.age = age;
         this.Address=Address;
    }
/*    Studentclass(){//构造方法重载
    }*/

    //方法
    void  study(){//定义方法

        System.out.println(name+"在学习");
    }
    void  sayHi()//定义方法
    {
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了,家住"+Address);
    }

}
