package day0323;

public class ObjectDemo {
    public static void main(String[] args) {

        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        System.out.println(p1==p2);//地址
        System.out.println(p1.equals(p2));//重写前是地址 重写后是内容


       /* Point p = new Point(100,200);
        System.out.println(p);//输出对象时默认调用toString()
*/

    }
}
