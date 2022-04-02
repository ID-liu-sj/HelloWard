package day0308;

public class OverLoadDome {
    public static void main(String[] args) {
        Aoo a=new Aoo();
        a.snow(27);
        a.snow("tiexi",27,"lsj");
        a.snow("lsj" );
        System.out.println(a);

    }
}
