import java.lang.*;
public class Math {
    public static String a;

    final static String str = "kbc";//静态常量
    public Math() {
       a = "ddd";//在构造方法中对参数进行初始化
    }
    public int SetNumber(int number){
        int w= number;//复制
        for (int i =0;i<100;i++){
            w++;
        }
        return w;

    }
    public int LenNumber(String str){
        String StrLength= str;
        int len = StrLength.length();
        return len;

    }
    public double max(double num1,double num2){
        return num1>num2?num1:num2;
    }
    public static void main(String[] args){
        Math m = new Math();
        System.out.println(a);
        System.out.println(m.SetNumber(1));
        System.out.println(Math.str);
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray); // String创建的字符串储存在公共池中而new创建的字符串对象在堆上
        System.out.println( helloString );
        String a1 = "clp"; // a1定义在主函数中
        System.out.println( a1 );
        System.out.println(a1+"字符串的长度是"+m.LenNumber(a1));//两个字符串相加一般使用+
        int floatVar = 11;
//        double floatVar1 = floatVar;
        System.out.printf("大傻子,"+"%d",floatVar);
        String s = "c,d,d,d,";
        String[] split = s.split(",");
        System.out.println(split[1]);// 分割字符串
//        System.out.println(java.lang.Math.random());
        System.out.println((int)m.max(java.lang.Math.random()*10,(int)java.lang.Math.random()*10));
    }

}
