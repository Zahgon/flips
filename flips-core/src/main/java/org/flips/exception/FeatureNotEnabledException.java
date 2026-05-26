package org.flips.exception;

import org.flips.model.Feature;
import java.lang.reflect.Method;

public class FeatureNotEnabledException extends RuntimeException {

    private Feature feature;

    public FeatureNotEnabledException(String message, Method method) {
        super(message);
        this.feature = new Feature(method.getName(), method.getDeclaringClass().getName());
    }

    public Feature getFeature() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
