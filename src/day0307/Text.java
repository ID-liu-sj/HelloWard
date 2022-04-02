package day0307;
import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        say();
        System.out.println();
        System.out.println();

        sayHellow("lsj", 27, "tx");
        System.out.println();
        System.out.println();

        int a = num();
        System.out.println(a);
        System.out.println();
        System.out.println();

        int b = plus(12, 15);
        System.out.println(b);
        System.out.println();
        System.out.println();

        int c = min();
        System.out.println("最小值为"+c);
        System.out.println();
        System.out.println();

        int[] d = are();
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
        System.out.println();
        System.out.println();
        int[] e = ar();
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
        System.out.println("倒序输出:");
        for(int i=e.length-1;i>=0;i--){
            System.out.println(e[i]);
        }
    }





    public static void say() {
        System.out.println("我叫lsj!!");
    }

    public static void sayHellow(String name, int age, String address) {
        System.out.println("我叫" + name + ",今年" + age + "岁了,住在" + address);
    }

    public static int num() {
        return 27;
    }

    public static int plus(int num1, int num2) {
        int num3 = num1 + num2;
        return num3;
    }

    public static int min() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                    min = arr[i];
                }
            }
        return min;
    }
    public  static int []are() {
        int[]arr=new int[5];
        int i;
        for ( i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int max = arr[0];
        for ( i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        arr=Arrays.copyOf(arr, arr.length+1);
        arr[arr.length-1]=max;
        System.out.println("最大值为"+max);

       return arr;
    }
    public static int[]ar(){
        int[]arr1=new int[5];
        int i;
        for ( i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
        }
        int max = arr1[0];
        for ( i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("最大值为"+max);
        Arrays.sort(arr1);
      return  arr1;
    }

















}

