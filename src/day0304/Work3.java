package day0304;

import java.util.Scanner;
public class Work3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double[]arr= new double[10];

        for (int i = 0;i< arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            arr[i]= scan.nextDouble();
        }

        int total=0;
        for (int i=0;i< arr.length;i++){
            total+=arr[i];
        }

        double avg = total/ arr.length;
        System.out.println("总分为"+total+",平均分为"+avg);












      /*  int[]arr =new int[5];
        for (int i = 0;i<arr.length;i++){
            arr[i]=100;
            System.out.println(arr[i]);
        }
*/


















    }
}
