package day0323;

import java.util.Arrays;
import java.util.Locale;
import java.util.zip.ZipEntry;

public class Test {
    public static void main(String[] args) {

        String a = "123";
        int b = Integer.parseInt(a);//将字符串装换成int类型
        System.out.println(b);


        double c = Double.parseDouble(a);
        System.out.println(c);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);









      /*  Text a = new Text(1,2);//重写了toSting()不然输出的是地址
        System.out.println(a);

        Text a1 = new Text(1,2);
        System.out.println(a==a1);//比较的是地址
        System.out.println(a.equals(a1));//以为重写了equal()所以比较的是内容x,y
        */






/*
        String a = "123,abc,456,fgh,678";
        String []e = a.split("[a-z]+");
        System.out.println(Arrays.toString(e));

        a= a.replaceAll("[,]","\\.");
        System.out.println(a);*/




        /*//[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)
        String email = "1182758611@qq.com";
        String  a = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)";
        boolean m = email.matches(a);
        if (m){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        */








/*
        String a = "    123,abc,456,dfg    ";
        int b = a.length();
        System.out.println(b);

        String c = a.trim();
        System.out.println(c);

        String d = a.toUpperCase();
        System.out.println(d);
        String f = a.toLowerCase();
        System.out.println(f);

        boolean g = a.startsWith("3");
        System.out.println(g);

        char h = c.charAt(3);
        System.out.println(h);

        int j = c.indexOf("2");
        System.out.println(j);

        String k = a.substring(7,9);
        System.out.println(k);*/


    }
}
