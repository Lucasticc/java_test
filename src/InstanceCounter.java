public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    public InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        InstanceCounter p = new InstanceCounter(); //实例化方法的时候就运行一次
        System.out.println("Starting with " +
                InstanceCounter.getCount() + " instances");
        for (int i = 0; i < 99; ++i){
//             new InstanceCounter();//调用方法用new
            p.addInstance();
            new InstanceCounter();//调用方法

        }
        System.out.println("Created " +
                InstanceCounter.getCount() + " instances");
    }
}