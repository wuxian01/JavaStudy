package chapter02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Java05_Date {
    public static void main(String[] args) {
        // TODO  Date 日期类
        // TODO Calendar: 日历类
        System.out.println(System.currentTimeMillis());

        Date date = new Date();
        System.out.println(date);
        // 格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = sdf.format(date);
        System.out.println(dateStr);

       // Date d = sdf.parse(dateStr);

        // 日历类
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(calendar.YEAR));
        calendar.setTime(new Date());
        calendar.add(Calendar.MONTH, 3);
    }
}
