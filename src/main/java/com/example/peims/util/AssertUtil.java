package com.example.peims.util;

/**
 * 判断工具类
 */
public class AssertUtil {

    public static void isTrue(Boolean expression, String msg) {
        if (expression) throw new RuntimeException(msg);
    }
}
