package day0303;

import java.util.Scanner;
public class Work {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =(int) (Math.random()*100+1);

        int Guess;


        do {
            System.out.println("快猜！");
            Guess = scan.nextInt();
            if (Guess>num){
                System.out.println("大了");
            }else if (Guess<num){
                System.out.println("小了");
            }


        }while (Guess!=num);
        System.out.println("恭喜猜对了");











       /* int Guess = scan.nextInt();
        while (Guess!=num){
            if (Guess>num){
                System.out.println("大了！");
            }else if (Guess<num){
                System.out.println("小了");
            }
            System.out.println("猜吧");
            Guess = scan.nextInt();

        }
        System.out.println("恭喜猜中了");
*/











/*


        System.out.println("请选择功能：1 收账；2 取钱；3 查询；0 退卡；");
        int command=scan.nextInt();



        switch (command){
            case 1:
                System.out.println("1 收账");
                break;
            case 2:
                System.out.println("2 取钱");
                break;
            case 3:
                System.out.println("3 查询");
                break;
            case 0:
                System.out.println("0 退卡");
                break;
            default:
                System.out.println("操作错误！");
        }


*/














        /*System.out.println("请输入成绩");
        int score = scan.nextInt();

        if (score>=80){
            System.out.println("你的成绩为"+score+"为A等级，优秀！");
        }else if (score>=60){
            System.out.println("你的成绩为"+score+"为b等级，良好！");
        }else {
            System.out.println("你的成绩为"+score+"为c等级，了不及格！");*/

        }
    }

