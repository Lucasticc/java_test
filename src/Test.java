class Animal {
    private String name;
    private int id;

    void eat() {
        System.out.println("animal : eat");
    }
    public String Chi(){
        return "shi";
    }
}

class Dog extends Animal {
//如果要调用父类的方法 需要super函数
    //子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 super 关键字调用父类的构造器并配以适当的参数列表。
    void eat() {
        System.out.println("dog : eat");
    }
    void eatTest() {
        this.eat();   // this 调用自己的方法
        super.eat();  // super 调用父类方法
        System.out.println(super.Chi());
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}