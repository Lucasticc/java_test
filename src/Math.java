public class Math {
    public static String a;
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
    public static void main(String[] args){
        Math m = new Math();
        System.out.println(a);
        System.out.println(m.SetNumber(1));
    }
}
