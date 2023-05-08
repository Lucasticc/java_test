public class Puppy{
    int puppyAge; //一个变量？
    //访问实例变量和调用成员
    public Puppy(String name){
        // 这个构造器仅有一个参数：name
//        this.name=name;
        System.out.println("小狗的名字是 : " + name );
    }
//    public Puppy(String age){
//        this(name);
//        this.age=age;
//
//    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("小狗的年龄为 : " + puppyAge );
        return puppyAge;
    }

    public static void main(String[] args){
        /* 创建对象 */
        Puppy myPuppy = new Puppy( "tommy" );
        /* 通过方法来设定age */
        myPuppy.setAge( 2 );
        /* 调用另一个方法获取age */
        myPuppy.getAge( );
        /*你也可以像下面这样访问成员变量 */
        System.out.println("变量值 : " + myPuppy.puppyAge );
        System.out.println("类中的方法："+myPuppy.getAge()); // 这个方法有return值 取值是从return中取得值
        System.out.println("类中的变量："+myPuppy.puppyAge);
        //创建对象之后 使用对象名可以访问类中的方法和变量
    }
}