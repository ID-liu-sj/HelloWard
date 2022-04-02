package day0311;

public class Text {
    public static void main(String[] args) {
        Person[]are=new Person[7];
        are[0]=new Student("l", 27, "男", "111");
        are[1]=new Student("s", 26, "女", "222");
        are[2]=new Student("j", 25, "男", "333");
        are[3]=new Doctor("w", 35, "女" , "主任医师");
        are[4]=new Doctor("s", 36, "男", "副主任医师");
        are[5]=new Teacher("j", 54, "男", 1888.0);
        are[6]=new Teacher("w", 34, "女", 3555.54);
        are[5].sayHi();

       /* for (int i=0;i< are.length;i++){
            System.out.println(are[i].name);
            are[i].sayHi();

        }
*/




    }
}