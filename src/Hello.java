public class Hello {
    // static关键字：静态 void 返回类型 main方法名
    //构造器
    public Hello(String name){
        System.out.println(name);
    }
    public static void main(String[] args){
        System.out.println("hello");
        Hello my = new Hello("s");
        //是不是属于调用构造器 构造器里已经完成
    }
}
