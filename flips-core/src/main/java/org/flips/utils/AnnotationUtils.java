package org.flips.utils;

import org.flips.model.FlipAnnotationAttributes;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public final class AnnotationUtils {

    private AnnotationUtils() {
        throw new AssertionError("No AnnotationUtils instances for you!");
    }

    public static <T extends Annotation> T getAnnotationOfType(Annotation annotation, Class<T> cls) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Annotation> T findAnnotationByTypeIfAny(Annotation[] annotations, Class<T> cls) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static boolean isMetaAnnotationDefined(Annotation annotation, Class<? extends Annotation> annotationType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Annotation[] getAnnotations(Method method) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Annotation[] getAnnotations(Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Annotation> T getAnnotation(Method method, Class<T> annotationType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static FlipAnnotationAttributes getAnnotationAttributes(Annotation annotation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Annotation> T findAnnotation(Class<?> clazz, Class<T> annotationType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
