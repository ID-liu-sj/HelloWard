package binary;

import java.security.InvalidKeyException;

public class OperDemo {
    public static void main(String[] args) {

/*

        int a = 5;
        System.out.println(a>>>1);
        System.out.println(a>>>2);
*/





      /*  int n = 0x679f1d98;
        int m = n<<1;
        int k = n<<2;
        int g = n<<9;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(g));*/







      /*  int n = 0xb9;
        int m = 0xbd00;
        int k = n|m;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(k));*/







                Loo o1 = new Loo();
                o1.show();
                Loo o2 = new Loo();
                o2.show();
                Loo o3 = new Loo();
                o3.show();
                System.out.println(Loo.b); //常常通过类名点来访问
            }
//演示静态变量




        /*int n = 0x614f7bb;
        int m = 0xff;
        int k = n&m;
        System.out.println(Integer.toBinaryString(k));*/
    }

class Loo{
    int a;
    static int b;
    Loo(){
        a++;
        b++;
    }
    void show(){
        System.out.println("a="+a+"，b="+b);
    }
}
