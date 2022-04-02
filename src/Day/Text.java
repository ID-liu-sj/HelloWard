package Day;

public class Text {
    public static void main(String[] args) {
        Student[]st=new Student[2];//创建一组学生数组
        st[0]=new Student("lsj", 27, "男", "234");//给数组成员赋值
        st[1]=new Student("ws", 23, "女", "2333");
        for (int i=0;i< st.length;i++){//遍历
            System.out.println(st[i].name);//输出数组成员名字
            st[i].sayHi();//调用sayHi方法
        }


    }

}
