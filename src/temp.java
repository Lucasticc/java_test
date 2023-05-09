public class temp {
    public static String a;
    public temp() {
        a = "cascade";

    }
    public static void main(String args[]){
        temp temp = new temp();
        StringBuffer sb = new StringBuffer();
        String[] s = new String[20];
        s=a.split("");
        int i = 0;
        while (i<a.length()){
            sb.append(s[i]);
            sb.append(",");
            i++;
        }
        System.out.println(sb);
    }
}
