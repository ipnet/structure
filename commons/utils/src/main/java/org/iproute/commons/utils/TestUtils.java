package org.iproute.commons.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * TestUtils
 *
 * @author zhuzhenjie
 * @since 2021/11/2
 */
public class TestUtils {

    private TestUtils() {
    }

    /**
     * Say string.
     *
     * @return the string
     */
    public static String say() {
        return "hello world";
    }


    /**
     * isEmpty 测试依赖
     *
     * @param cs the CharSequence
     * @return the boolean
     */
    public static boolean isEmpty(final CharSequence cs) {
        return StringUtils.isEmpty(cs);
    }
}
