package day0303;
import java.util.Scanner;
public class Work3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = scan.nextInt();
        System.out.println("请输入月份:");
        int month = scan.nextInt();
        int days = 0; //天数
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if((year%4==0 && year%100!=0) || year%400==0){
                    days = 29;
                }else{
                    days = 28;
                }
        }
        System.out.println(year+"年的"+month+"月共"+days+"天");
    }
}