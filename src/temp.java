public class temp {
    public static String a;
    public temp() {
        a = "cascade";

    }
    public static void main(String args[]){
        temp temp = new temp();
        StringBuffer sb = new StringBuffer();
        StringBuffer ne = new StringBuffer();
        String[] s = new String[20];
        s=a.split("");
        int i = 0;
        while (i<a.length()){
            sb.append(s[i]);
            sb.append(",");
            i++;
        }
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.delete(2,8));
        System.out.println(sb.replace(2,3,"dd"));
        System.out.println(sb.length() );
        int [] myList ={1,2,3,4,5,76};
        for (int element:myList){
            ne.append(element);
            ne.append("..");
        }
        System.out.println(ne);
    }
}
