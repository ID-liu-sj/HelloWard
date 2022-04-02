package day0322;

public class TrimDemo {
    public static void main(String[] args) {

        String str = "     hello word     ";
        System.out.println(str);
        str = str.trim();
        System.out.println(str);


        String a = "    11 11     ";
        System.out.println( a);
        a = a .trim();
        System.out.println(a);


        String s = "  222";
        System.out.println(s);
        s = s .trim();
        System.out.println(s);
    }
}
