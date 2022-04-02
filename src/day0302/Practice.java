package day0302;

import java.awt.image.ShortLookupTable;

public class Practice {
    public static void main(String[] args) {



        int a=5,b=10,c=5;
        boolean b1=b>a&&b<c;//true&&false
        System.out.println(b1);//false
        System.out.println(b<=c&&b>a);//false&&true,false
        System.out.println(a==b&&c>b);//false&&false,false
        System.out.println(b!=c&&a<b);//true&&true,true

        System.out.println(b>=a||b<c);
        System.out.println(b<=c||b>a);
        System.out.println(b!=c||a<b);
        System.out.println(a==b||c>b);








      /*  int a=5,b=10,c=5;
        boolean b1=b>a;
        System.out.println(b1);//true
        System.out.println(c<b);//true
        System.out.println(a>=c);//true
        System.out.println(b<=a);//false
        System.out.println(b==c);//false
        System.out.println(a!=c);//false


        System.out.println(a+c>10);//false
        System.out.println(b%2==0);//true
        System.out.println(c++>5);//false,c自增1为6
        System.out.println(c++>5);//true,c自增1为7*/







       /* System.out.println(5%2);//1
        System.out.println(8%2);//0
        System.out.println(2%8);//2

        int a=5,b=5;
        a++;
        ++b;
        System.out.println(a);//6
        System.out.println(b);//6

        a--;
        --b;
        System.out.println(a);//5
        System.out.println(b);//5

        int c=a--;
        int d=--b;
        System.out.println(a);//4
        System.out.println(b);//4
        System.out.println(c);//5
        System.out.println(d);//4
*/









      /*  int year=1996;
        if (year%4==0&&year%100!=0||year%400==0){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"是平年");
        }
*/







        /*
        int a = 2,b=3;
        int max=a<b?b:a;
        System.out.println("max="+max);

        if (a<b){
            System.out.println("max="+b);

        }else {
            System.out.println("max="+a);

        }

         */












/*
        int a=1,b=2,c=3;
        int d=a+b;
        a+=5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


 */









    }
}
