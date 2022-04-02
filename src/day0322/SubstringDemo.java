package day0322;

import jdk.management.resource.ResourceType;

public class SubstringDemo {
    public static void main(String[] args) {

        String a = "www.9p234.cn";
        String name = a.substring(4);
        System.out.println(name);
        String name1 = a.substring(4,9);
        System.out.println(name1);

        String e = "www.baidu.com";
        String q = e.substring(4);
        System.out.println(q);
        String r = e.substring(10);
        System.out.println(r);



    }
}
