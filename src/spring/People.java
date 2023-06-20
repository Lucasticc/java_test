package spring;

//        (1)接口可以被多重实现（implements）,抽象类只能被单一继承（extends）
//        (2)接口只有定义,抽象类可以有定义和实现
//        (3)接口的字段定义默认为:public static final, 抽象类字段默认是"friendly"(本包可见)
public interface People {
    public void say();
    public int re();
}
