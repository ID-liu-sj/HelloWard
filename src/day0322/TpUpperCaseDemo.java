package day0322;

public class TpUpperCaseDemo {
    public static void main(String[] args) {

        String str = "我爱Java";
        String upper = str.toUpperCase();
        System.out.println(upper);

        String lower = str.toLowerCase();
        System.out.println(lower);


        String a = "     w oPlLL";
        a = a.toLowerCase();
        System.out.println(a);
        a = a.trim();
        a = a.toUpperCase();
         int length  =a.length();
        System.out.println(a );
        System.out.println(length);



    }
}
