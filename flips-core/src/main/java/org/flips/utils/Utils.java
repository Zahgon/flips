package org.flips.utils;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public final class Utils {

    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    private Utils() {
        throw new AssertionError("No Utils instances for you!");
    }

    public static boolean isEmpty(Object[] array) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isEmpty(String str) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Object emptyArray(Class clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Method getAccessibleMethod(Method method) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Object invokeMethod(Method method, Object obj, Object... args) throws InvocationTargetException, IllegalAccessException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
