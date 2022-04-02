package day0323;

public class MathchesDemo {
    public static void main(String[] args) {
        //[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
        String email = "1182758611@qq.com";
        String a = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(a);
        if (match){
            System.out.println("ture");
        }else{
            System.out.println("false");
        }
    }
}
