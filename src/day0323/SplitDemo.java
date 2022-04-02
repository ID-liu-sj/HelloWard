package day0323;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {


        String a = "123abc456dfg789hij";
        String []b = a.split("[0-9]+");

        a = "..123...456.789....";
        b = a.split("\\.");
        System.out.println(Arrays.toString(b));

        b = a.split("\\.");
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(b));


      /*  a = "123,456,789";
        b = a.split(",");
        System.out.println(Arrays.toString(b));
        a = "123.456.789";
        b = a.split("\\.");
        System.out.println(Arrays.toString(b));
*/
    }
}
