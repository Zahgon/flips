package org.flips.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.expression.BeanExpressionContextAccessor;
import org.springframework.context.expression.BeanFactoryResolver;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public class FeatureExpressionContext {

    private BeanFactory beanFactory;

    @Autowired
    public FeatureExpressionContext(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public ExpressionParser getExpressionParser() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public EvaluationContext getEvaluationContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
