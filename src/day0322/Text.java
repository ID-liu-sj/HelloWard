package day0322;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.xml.stream.events.StartElement;
import java.util.Locale;

public class Text {
    public static void main(String[] args) {

        String s = new String("hello");//String对象
                   //01234567890
        String s1 = "   hello   ";//"hello字面量对象
        //s1 = s1.trim();
       // System.out.println(s1);
        StringBuilder a = new StringBuilder(s1);
        a.append("word");
        System.out.println(a);
        a.insert(11,"my   ");
        System.out.println(a);
        a.reverse();
        System.out.println(a);

      /*  a.delete(11,50);//超过长度整体删除
        System.out.println(a);

        a.replace(3,50, "Hello");//超过长度就整体替换
        System.out.println(a);*/
        /*a.delete(0,3);
        System.out.println(a);
*/

       /* String a = s1.substring(3,8);
        System.out.println(a);
        String b = s1.substring(3);
        System.out.println(b);
        String c = s1.substring(3,20);//报错
        System.out.println(c);*/

      /*  int c = s1.indexOf("wo");//不包含就报-1
        System.out.println(c);

        int b = s1.lastIndexOf("l" );
        System.out.println(b);
        int a = s1.indexOf("l");
        System.out.println(a);*/


      /*
        *//**char c = s1.charAt(10);//报错*//*
        char c = s1.charAt(3);
        System.out.println(c);
*/
/*
        boolean satre = s1.startsWith("h");
        System.out.println(satre);
        boolean end = s1.endsWith("o");
        System.out.println(end);*/



      /*  System.out.println(s==s1);
        System.out.println(s.equals(s1));
*/
/*
        int length = s1.length();
        System.out.println(length);*/
/*


        String up = s1.toUpperCase();
        System.out.println(up);

        String low = s1.toLowerCase();
        System.out.println(low);
*/





    }
}
