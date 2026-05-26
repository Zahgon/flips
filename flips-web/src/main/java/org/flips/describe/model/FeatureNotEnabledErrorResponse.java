package org.flips.describe.model;

import org.flips.exception.FeatureNotEnabledException;
import org.flips.model.Feature;

public class FeatureNotEnabledErrorResponse {

    private String errorMessage;

    private Feature feature;

    public FeatureNotEnabledErrorResponse(FeatureNotEnabledException ex) {
        this.errorMessage = ex.getMessage();
        this.feature = ex.getFeature();
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFeatureName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getClassName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
