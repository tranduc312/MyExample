package anthoer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample {

    public static void main(String[] args) {

//        -- bundle-watchs-1-1680667950961
//        -- bundle-watchs-1-1680667950962
//        -- bundle-watchs-1
//        System.out.println(decodeSku("bundle-watchs-1-1680667950961"));
//        System.out.println(decodeSku("bundle-watchs-1-1680667950962"));
//        System.out.println(decodeSku("bundle-watchs-1"));
//        System.out.println(decodeSku("bundlewatchs1"));
//        System.out.println(decodeSku(""));
//        System.out.println(decodeSku(null));
        System.out.println(testDateFormat(""));
        System.out.println(testDateFormat(""));
        System.out.println(testDateFormat(""));
        System.out.println(testDateFormat(""));
    }

    static String testDateFormat(String lastDate) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = dateFormat.parse(lastDate);
            return date.toString();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static String decodeSku(String sku) {
        return sku != null && sku.lastIndexOf("-") != -1
                ? sku.substring(0, sku.lastIndexOf("-"))
                : sku;
    }
}
