class Animal1 {
    public void move(){
        System.out.println("动物可以移动");
    }
    public int c(int a ){
        return a;
    }
}

class Dog1 extends Animal1 {
    @Override
    public int c(int a) {
        System.out.println("sss");
        return super.c(a);
    }

    @Override
    public void move() { // 重写调用父类方法
        super.move();
        System.out.println(super.c(666));
        System.out.println(c(666));
    }
    public void move1(){
        super.move(); // 应用super类的方法
        System.out.println(super.c(666)); // super 就是可以调用父类的方法
        System.out.println("狗可以跑和走");

    }
}

public class ov{
    public static void main(String args[]){

        Animal1 b = new Dog1(); // Dog 对象
        Dog1 d = new Dog1();
        //向下转型
        //子类类型 子类变量名 = （子类类型） 父类变量名
        Dog1 dog1 = (Dog1) b;
        dog1.move1();
        b.move(); //执行 Dog类的方法

    }
}