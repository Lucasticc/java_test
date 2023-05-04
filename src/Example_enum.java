class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    // 关键字enum
    FreshJuiceSize size;
}
//好像就是给定预先设置好的值
//在类中生命 属性和方法 对对象进行操作 类型变量
public class Example_enum {
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE  ;
        System.out.println(juice.size);
        System.out.println(juice.size);
    }
}