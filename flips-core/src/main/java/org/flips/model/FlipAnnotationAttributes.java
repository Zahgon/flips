package org.flips.model;

import org.flips.utils.ValidationUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlipAnnotationAttributes {

    private Map<String, Object> attributes = new HashMap<>();

    private FlipAnnotationAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    private Optional<Object> getAttributeValue(String attributeName) {
        ValidationUtils.requireNonEmpty(attributeName, "attributeName can not be NULL or EMPTY");
        return Optional.ofNullable(attributes.get(attributeName));
    }

    public <T> T getAttributeValue(String attributeName, T defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private Map<String, Object> attributes = new HashMap<>();

        public Builder addAll(Map<String, Object> newAttributes) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public FlipAnnotationAttributes build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
