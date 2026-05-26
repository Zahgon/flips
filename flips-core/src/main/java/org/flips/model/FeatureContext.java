package org.flips.model;

import org.flips.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.stereotype.Component;

@Component
public class FeatureContext {

    private Environment environment;

    private FeatureExpressionContext featureExpressionContext;

    private static final Logger logger = LoggerFactory.getLogger(FeatureContext.class);

    @Autowired
    public FeatureContext(Environment environment, FeatureExpressionContext featureExpressionContext) {
        this.environment = environment;
        this.featureExpressionContext = featureExpressionContext;
    }

    public <T> T getPropertyValueOrDefault(String property, Class<T> t, T defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String[] getActiveProfilesOrEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ExpressionParser getExpressionParser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EvaluationContext getEvaluationContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
