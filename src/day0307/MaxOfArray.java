package day0307;
import  java.util.Arrays;

public class MaxOfArray {
    public static void main(String[] args) {
        int are [] = new int[10];
        int i;
        int max=0;
        for (i=0;i< are.length;i++){
            are[i]=(int) (Math.random()*100);
            if (are[i]>max){
                max=are[i];
            }
            System.out.println(are[i]);
        }
        System.out.println("最大值为"+max);


        System.out.println();
        System.out.println();
        Arrays.sort(are);
        for (i=0;i<are.length;i++){
            System.out.println(are[i]);
        };




















       /* int[]arr= new int[5];//定义arr数组
        int i;//下标
        for (i =0;i<arr.length;i++){
            arr[i]=(int) (Math.random()*100);//赋值arr数组所有元素的随机值
            System.out.println(arr[i]);//输出
        }
        int max = arr[0];//定义初始最大值为数组第一个元素
        for (i=1;i<arr.length;i++){
            if (arr[i]>max){//如果下一个元素大于前一个元素
              max=arr[i];//则后一个元素赋值max

            }
        }*/
        /*int max = arr[0];//定义初始最大值为数组第一个元素
        for (i=1;i<arr.length;i++){
            if (arr[i]>max){//如果下一个元素大于前一个元素
                max=arr[i];//则后一个元素赋值max
        System.out.println("z最大值为"+max);//输出*/

       /* arr=Arrays.copyOf(arr, arr.length+1);//扩容新的arr数组容量+1
        arr[arr.length-1]=max;//max赋值新的数组arr最后一个元素
        for (i= 0;i<arr.length;i++){
            System.out.println(arr[i]);//输出新的数组所有元素
        }*/



       /* int arr[]=new int[5];
        int i;
        for (i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        int max = arr[0] ;
        for (i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];

            }
        }
        System.out.println("最大值为"+max);
*/





    }
}
