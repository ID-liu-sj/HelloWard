package day0308;

public class StudentTest {
    public static void main(String[] args) {

        Studentclass lsj = new Studentclass("刘思佳",23,"tx");//创建一个新的对象
        lsj.name= "刘思佳";//给成员变量赋值
        lsj.Address="tiexi";
        lsj.age=27;
        lsj.study();//调用类的方法
        lsj.sayHi();
        Studentclass wsj=new Studentclass("wsj",27,"hsh");

        Studentclass wp = new Studentclass();
        wp.name="wangp";
        wp.age=10;
        wp.Address = "sh";
        wp.sayHi();
        wp.study();





    }
}
