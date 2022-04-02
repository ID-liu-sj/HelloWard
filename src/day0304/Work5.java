package day0304;
import java.util.Scanner;
public class Work5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;
        for (int i=1;i<=5;i++){

            int a = (int) (Math.random()*100);
            int b = (int) (Math.random()*100);
            int c = (a+b);
            System.out.println("请答题");
            System.out.println(a+"+"+b+"=");




            int d = scan.nextInt();
            if (d==-1){
                break;

            }
            if (c==d){
                score+=10;

                System.out.println("恭喜你 答对了 ");


            }else{
                System.out.println("答错了");
            }
        }
        System.out.println("你的总分为"+score);










        /*int num = 1; //阶乘
        for(int i=1;i<=8;i++){
            num*=i;//num=num*i
            //       1*1
            */



            //1*2*3*4*5*6*7*8
     /*   }
        System.out.println("num="+num);
*/








/*
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6-i;j++){ //空格
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }

            System.out.println();
        }*/
    }
}
