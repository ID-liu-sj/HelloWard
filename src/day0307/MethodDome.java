package day0307;

public class MethodDome {
    public static void main(String[] args) {

        int []are = arr();
        System.out.println(are.length);

        for (int i =0;i<are.length;i++){
            System.out.println(are[i]);
        }

        System.out.println(are[are.length-2]);
  /*  say();
    say1();
    sayHi("刘思佳");
    sayHello("刘思佳", "铁西", 27);*/
    /*int a= readWord();
    int b= readWord();
        System.out.println(a+b);*/
      /*  int d = plue(3, 5);//(4)调用plus方法并给plue方法a,b赋值
        System.out.println(d);//(5)输出returnc的值

        int e=12,f=23;//定义e,f两个变量
        int g=plue(e, f);//调用plue方法并给e=a,f=b赋值
        System.out.println(g);
        */
    }
    public static int []arr(){
        int[]arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int) (Math.random()*100);
        }return arr; }
    public static int plue(int a,int b){//(1)定义plue方法,定义a,b两个变量
        int c = a+b ;//(2)定义c=a+b
        return c;}//(3)返回c=a+b的值给调用plue方法
public static int readWord(){
        return 27; }
    public static void say(){
        System.out.println("口蘑口蘑，色蓝色蓝！！"); }
    public static void say1(){
        System.out.println("越来越好，一路肠虹！！！"); }
    public  static void sayHi(String name){
        System.out.println("大家好,我叫"+name+",今年27岁了!"); }
    public static void sayHello(String name,String ad,int age){
        System.out.println("大家好我叫"+name+",今年"+age+"岁了,住在"+ad); }






}
