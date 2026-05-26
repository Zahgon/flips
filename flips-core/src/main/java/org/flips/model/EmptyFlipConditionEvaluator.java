package org.flips.model;

import org.springframework.context.ApplicationContext;

class EmptyFlipConditionEvaluator extends FlipConditionEvaluator {

    protected EmptyFlipConditionEvaluator(ApplicationContext applicationContext, FeatureContext featureContext) {
        super(applicationContext, featureContext);
    }

    @Override
    public boolean evaluate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
