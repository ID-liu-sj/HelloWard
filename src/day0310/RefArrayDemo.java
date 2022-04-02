package day0310;

public class RefArrayDemo {
    public static void main(String[] args) {
        Studentclass[]are=new Studentclass[3];
        are[0]=new Studentclass("lsj", 27, "tx");
        are[1]=new Studentclass("wsj", 27, "tx");
        System.out.println(are[0].age);

        are[0].age=25;//修改第一个元素的年龄为25
        System.out.println(are[0].age);

        are[2]=new Studentclass("wp", 21, "sh");
        are[2].sayHi();
        for (int i=0;i<are.length;i++){
            System.out.println(are[i].name);
            are[i].sayHi();
        }








    }
}
