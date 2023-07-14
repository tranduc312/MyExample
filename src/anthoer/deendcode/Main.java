package anthoer.deendcode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        String value1 = "&";
        System.out.println(encode(value1));
        String value2 = "'";
        String value3 = "\"";
        System.out.println(encode(value2));
        System.out.println(encode(value3));
        String value4 = "SUPPORT-DLTUFF.050WH10'";
        String value5 = "SUPPORT-DLTUFF.050WH10\"";
        System.out.println(encode(value4));
        System.out.println(encode(value5));
    }

    static String decode(String value) {
        try {
            return URLDecoder.decode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    static String encode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
