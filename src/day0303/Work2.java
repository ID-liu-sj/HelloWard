package day0303;
import java.util.Scanner;
public class Work2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        int a=1;
        a=++a;
        while (a<=100){
            sum=((++a)+(100-(a)))*50+50;
        }
        System.out.println(sum);






       /* int sum = 0;
        int a = 1;
        while (a <= 100) {
            sum += a;
            a++;
        }
        System.out.println("sum="+sum);
*/













    }

}

















 /*
        System.out.println("请输入年份及月份");
        int year = scan.nextInt();
        int month = scan.nextInt();
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println(year+"年"+month+"月31天");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println(year+"年"+month+"月30天");
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {

                        System.out.println(year+"年"+month+"月29天");

                    } else {
                        System.out.println(year+"年"+month+"月28天");

                    }
                break;

            }

        }
    }


*/
/*
 System.out.println("请输入年份及月份");
         int year = scan.nextInt();
         int month = scan.nextInt();


         switch (month) {
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:

         break;

         }
         System.out.println(year + "年" + month + "月为31天");
         } else if (){
         switch (month) {
         case 4:
         case 6:
         case 9:
         case 11:
         break;
         }
         System.out.println(year + "年" + month + "月为30天");
         }
         }
         }*/













        /*   System.out.println("请输入一个整数");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("+");
        } else if (num < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");

        }
*/






























