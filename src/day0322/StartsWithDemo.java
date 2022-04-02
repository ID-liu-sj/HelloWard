package day0322;

import java.util.Locale;

public class StartsWithDemo {
    public static void main(String[] args) {

        String str = "thingking in java ";
        str = str.trim();
        boolean stare = str.startsWith("t");
        System.out.println(stare);

        boolean end = str.endsWith("a");
        System.out.println(end);



        String a = "wo ai ski ";
        a = a.trim();
        boolean s = a.startsWith("w");
        System.out.println(s );
        boolean d = a.endsWith("ki");
        System.out.println(d);

        String e = "sadkawhei skandwk ";
        e = e.trim();
        System.out.println(e);
        boolean sta = e.startsWith("sa");
        System.out.println(sta);
        boolean en =e.endsWith("wk");
        System.out.println(en);
    }
}
