package day0322;
//获取域名的方法
public class LocalTest {
    public static void main(String[] args) {
        String name = "www.baidu.com";
        String a = getName(name);
        System.out.println(a);

        String name1 = "www.sina.com.cn";
        String b = getName(name1);
        System.out.println(b);

        String name2 = "www.tianya.cn";
        String c = getName(name2);
        System.out.println(c);

    }

    public static String getName(String line){
        int start = line.indexOf(".")+1;
        int end = line.indexOf(".", start);
        return line.substring(start,end);
    }

}
