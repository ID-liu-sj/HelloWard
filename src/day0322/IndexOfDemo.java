package day0322;

public class IndexOfDemo {
    public static void main(String[] args) {

         String str = "thinking in java";
         int index = str.indexOf("in");
        System.out.println(index);

        index = str.indexOf("in",3);
        System.out.println(index);
        index = str.indexOf("IN");
        System.out.println(index);

        String a = "sakdjiw aksdjio skdw";
        int e = a.indexOf("k");
        System.out.println(e);
        e = a.indexOf("d",4);
        System.out.println(e);
        e = a.indexOf("E");
        System.out.println(e);
        e = a.lastIndexOf("d");
        System.out.println(e);




    }
}
