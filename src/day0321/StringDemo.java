package day0321;

public class StringDemo {
    public static void main(String[] args) {
/*

        String s1 = "123abc";
        String s2 = "123"+"abc";//若是两个字面量链接则直接运算好并保存 相当于"123abc
        String s3 = "123";
        String S4 = s3+"abc";//s3不是字面量 是对象 所以会新建123abc对象,不会重用常量池中的123abc

        System.out.println(s1 == s2);

        System.out.println(s1 == S4);//false
*/

        String s1 = "123abc";
        String s2 = "123"+"abc";
        System.out.println(s1 == s2);
        String s3 = "123";
        String s4 = s3+"abc";
        System.out.println(s4 == s2);






/*

        String s1 = "123abc";
        String s2 = "123abc";
        String s3 = "123abc";
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);

        s1= s1+"!";
        System.out.println(s1==s2);
*/


      /*  String s1 = "123abc";
        String s2 = "123abc";
        String s3 = "123abc";
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);

        s1 = s1 + "!";//创建新的字符串对象并赋值给s1
        System.out.println(s1 == s2);
        */

    }
}
