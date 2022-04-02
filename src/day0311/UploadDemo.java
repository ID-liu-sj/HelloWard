package day0311;

public class UploadDemo {
    public static void main(String[] args) {

        Aoo sj=new Aoo();
        Boo ls = new Boo();
        Aoo s=new Boo();
        //Boo j = new Aoo();报错
        sj.a=1;
        sj.shou();
        ls.b=1;
        ls.shou();
        ls.a=2;
        ls.text();
        s.a=1;
        s.shou();
        /*j.a;
        j.b;
        j.shou();
        j.text();*/

    }
}
