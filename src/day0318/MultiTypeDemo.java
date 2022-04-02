package day0318;
//多态演示
public class MultiTypeDemo {
    public static void main(String[] args) {
        Aoo o=new Boo();//向上造型,潜艇超类造型水雷
        if (o instanceof Boo){
        Boo o1=(Boo) o;//引用o指向的对象就是Boo,水雷强转水雷
        }else{
            System.out.println("不是Boo类型");
        }
        if (o instanceof Inter){
            Inter o2=(Inter) o;//引用所指向的对象实现的Inter接口
        }else{
            System.out.println("不是Inter类型");
        }
        if (o instanceof Coo){
            Coo o3 = (Coo)o;//引用所指向的对象与Coo无关,运行会发生ClassCastException类型转换异常,其他潜艇强转水雷,报错
        }else{
            System.out.println("不是Coo类型");
        }








    }
}
