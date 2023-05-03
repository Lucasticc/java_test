class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }
    // 关键字enum
    FreshJuiceSize size;
}
//好像就是给定预先设置好的值
public class Example_enum {
    public static void main(String[] args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.LARGE  ;
        System.out.println(juice.size);
    }
}