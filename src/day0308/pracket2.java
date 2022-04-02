package day0308;

import java.util.Arrays;

public class pracket2 {
    public static void main(String[] args) {
        say();
        sayHellow(27);
        sayHi("liusijia");
        int q = height();
        double w = width();
        int []er=arr1();


    prackte1 b= new prackte1();
        b.NO1("刘思佳");
        int []arr=new int[]{3,4,5};
        int []are=new int[3];
        int[]aar;
        aar=new int[3];
        System.out.println(arr[0]);
        System.out.println(arr.length);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.arraycopy(arr, 0, are, 0, 3);
        System.arraycopy(aar, 0, arr, 0, 3);

        int[]a= Arrays.copyOf(arr, 3);
        int[]c=Arrays.copyOf(are, 3);



        int []ace=new int[6];
        int i;
        for (i=0;i<ace.length;i++){
            ace[i]=(int) (Math.random()*100);
            System.out.println(ace[i]);

        }
        Arrays.sort(ace);
        System.out.println("数据排序后");
        for (i=0;i<ace.length;i++){
            System.out.println(ace[i]);
        }









}
public static void say(){
    System.out.println("我叫name");

}
public  static  void sayHi(String name){
    System.out.println("我叫"+name);
}
public static int sayHellow(int age){
    System.out.println("我今年"+age);
return 27;
    }

    public static int height(){
        return 182;

    }
    public static double width(){
return 72.4;
    }
    public static int[]arr1(){
        int[]arr = new int[6];
        for (int i=0;i<arr.length;i++){
            arr[i]=(int) (Math.random()*100);

        }
        return arr;
    }

    }