package day0307;

public class Practice {
    public static void main(String[] args) {
        int arr[]=new int[6];


        int i;
        for (i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*100);

            System.out.println(arr[i]);
        }
        int max=arr[0];
        for (i=1;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }


            }
        System.out.println("最大值为"+max);
        }






















    }

