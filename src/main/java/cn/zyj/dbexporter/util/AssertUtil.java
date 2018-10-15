package cn.zyj.dbexporter.util;

import org.springframework.util.Assert;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 补充Junit的Assert的不足
 */
public class AssertUtil {

    private static final DateFormat FORMAT_DEFAULT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static void fail(Object expect, Object actual) {
        throw new AssertionError(String.format("expect:%s,actual:%s", expect, actual));
    }

    public static void dateEquals(Date expect, Date actual) {
        if (expect == null && actual == null) return;
        if (expect == null || actual == null) fail(expect, actual);
        if (!FORMAT_DEFAULT.format(expect).equals(FORMAT_DEFAULT.format(actual))) {
            fail(expect, actual);
        }
    }
}
