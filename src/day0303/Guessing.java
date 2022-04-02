package day0303;
import java.util.Scanner;
public class Guessing {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int num = (int) (Math.random()*100+1);
        System.out.println(num);
        int Guess;

        do {
            System.out.println("快猜！");
            Guess=scan.nextInt();
            if (Guess>num){

                System.out.println("大了");
            }else if (Guess<num){

                System.out.println("小了");
            }


        }while (Guess!=num);
        System.out.println("恭喜答对了");















        /*
        int num =(int) (Math.random()*100+1);
        System.out.println(num);
        System.out.println("快猜");
        int Guess=scan.nextInt();
        while (Guess!=num){
            if (Guess>num){
                System.out.println("1到"+Guess);
            }else {
                System.out.println(Guess+"到100");
            }

            System.out.println("快猜");
            Guess=scan.nextInt();

        }
        System.out.println("还算聪明！！！");

         */





    }
}
