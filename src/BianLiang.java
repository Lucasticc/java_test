public class BianLiang {
    // 成员变量
    private int instanceVar;//声明在类里的是成员变量 私有变量如果其他类想要访问的话 可以定义方法来操作这个变量
    String b; //变量和方法的声明可以不使用任何修饰符
    // 静态变量
    private static int staticVar;//私有的静态变量

    public int method(int paramVar) { // 方法
        // 局部变量
        int localVar = 10;

        // 使用变量
        instanceVar = localVar; // 将局部变量传给 类里的私有变量
        staticVar = paramVar;

        System.out.println("成员变量: " + instanceVar);
        System.out.println("静态变量: " + staticVar);
        System.out.println("参数变量: " + paramVar);
        System.out.println("局部变量: " + localVar);
        System.out.println(this.staticVar); //this就是在类中调用类中定义的变量
        return localVar;
    }

    public static void main(String[] args) {
        BianLiang v = new BianLiang();
        v.method(201);
        System.out.println(v.method(20));//方法中每次调用都需要执行
        v.b="we"; //定义成员变量设置其值
        System.out.println(v.b);

    }
}