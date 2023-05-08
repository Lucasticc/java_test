public class ZiDongLeiZhuan{
    public static void main(String[] args){
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
        double avg1 = 79.22;
        int rise = 5;
        double avg2 = avg1+rise;
        System.out.println(avg2);//自动类型转换
        int avgInt= (int)avg1;//强制类型转换 转为int类型 前面加个括号注释转换类型
        double avgDouble = (double)avgInt; // int 转 double 可以自动转换
        System.out.println(avgDouble);
        System.out.println(avgInt);
    }
}