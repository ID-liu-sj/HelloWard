package day0304;

import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  score = 0;


        for (int i = 1; i <= 10; i++) {
            int num = (int) (Math.random() * 100);
            int num2 = (int) (Math.random() * 100);
            System.out.println("算吧");
            System.out.println(num + "+" + num2+ "=");
            int answer =  scan.nextInt();
            if ( answer == num+num2) {
                System.out.println(num + "+" + num2 + "=" + answer + ",答对了");

                score += 10;

            } else {
                System.out.println(num + "+" + num2 + "=" + (num+num2) + ",答错了");

            }




        }
        System.out.println("你的总分为"+score);



        }
    }
