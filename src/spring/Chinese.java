package spring;

public class Chinese implements People {
    public void say() {
        System.out.println(" 你好！");
    }
    public int re(){
        return 1;
    }
    public static void main(String[] args) {
        People chinese = new Chinese() ;
        chinese.say();
        System.out.println(chinese.re());
    }
}

