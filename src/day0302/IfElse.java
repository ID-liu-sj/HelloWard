package day0302;

public class IfElse {
    public static void main(String[] args) {

        //奇偶数判断；
        int num=5;
        if (num%2==0){
            System.out.println(num+"是偶数");
        }else {
            System.out.println(num+"是奇数");
        }
        System.out.println("继续执行");
        //满500打8折，不满打9折；
        double price=600;
        if (price>=500){
            System.out.println("最终价格为"+(price*=0.8));
        }else {
            System.out.println("最终价格为"+(price*=0.9));
        }

        System.out.println("继续执行");


    }
}
