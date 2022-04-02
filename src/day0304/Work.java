package day0304;
import java.util.Scanner;
public class Work {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int score = 0;
        for (int i = 0;i<10;i++){
            int a = (int) (Math.random()*100);
            int b = (int)(Math.random()*100);
            int end=a+b;
            System.out.println("请答题");
            System.out.println(a+"+"+b+"=");
            int answer = scan.nextInt();
            if (answer==-1){
                break;
            }
            if (answer== end){
                System.out.println("恭喜你，回答正确");
                score+=10;
            }else{
                System.out.println("回答错误");
            }
        }
        System.out.println("你的最终成绩为"+score);































    }
}
