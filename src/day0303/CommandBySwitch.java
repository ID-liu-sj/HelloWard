package day0303;
import java.util.Scanner;
public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择功能：1-存款 2-取款 3-查询余额 0-退卡");
        int command = scan.nextInt();



        switch (command){
            case 1:
                System.out.println("存款功能...");
                break;
            case 2:
                System.out.println("取款功能...");
                break;
            case 3:
                System.out.println("查询余额功能...");
                break;
            case 0:
                System.out.println("退卡功能...");
                break;
            default:
                System.out.println("c操作错误...");





        }


















    }
}
