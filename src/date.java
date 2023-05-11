import java.util.*;
import java.text.*;//引用全部
public class date {
//    public static String[][] str = new String[3][4];
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");// hh是12小时 HH是24小时制
        System.out.println("当前时间为: " + ft.format(date));
        System.out.printf("当前时间为: " +"%tY", date);
        System.out.printf("%tY-%tm-%td %tH:%tM:%tS", date, date, date, date, date, date);

    }
}
