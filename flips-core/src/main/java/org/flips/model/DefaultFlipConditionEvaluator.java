package org.flips.model;

import org.flips.annotation.FlipOnOff;
import org.flips.condition.FlipCondition;
import org.flips.utils.AnnotationUtils;
import org.flips.utils.ValidationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.Map;

class DefaultFlipConditionEvaluator extends FlipConditionEvaluator {

    private static final Logger logger = LoggerFactory.getLogger(DefaultFlipConditionEvaluator.class);

    private Map<Class<? extends FlipCondition>, FlipAnnotationAttributes> flipConditions = new LinkedHashMap<>();

    protected DefaultFlipConditionEvaluator(ApplicationContext applicationContext, FeatureContext featureContext, Annotation[] annotations) {
        super(applicationContext, featureContext);
        ValidationUtils.requireNonNull(annotations, "annotations[] can not be null while constructing DefaultFlipConditionEvaluator");
        buildFlipConditions(annotations);
    }

    private void buildFlipConditions(Annotation[] annotations) {
        for (Annotation annotation : annotations) {
            if (AnnotationUtils.isMetaAnnotationDefined(annotation, FlipOnOff.class)) {
                Class<? extends FlipCondition> condition = AnnotationUtils.getAnnotationOfType(annotation, FlipOnOff.class).value();
                FlipAnnotationAttributes annotationAttributes = AnnotationUtils.getAnnotationAttributes(annotation);
                flipConditions.put(condition, annotationAttributes);
            }
        }
        logger.debug("Built DefaultFlipConditionEvaluator {}", flipConditions);
    }

    private boolean evaluateFlipCondition(ApplicationContext applicationContext, FeatureContext featureContext, Class<? extends FlipCondition> conditionClazz, FlipAnnotationAttributes flipAnnotationAttributes) {
        return applicationContext.getBean(conditionClazz).evaluateCondition(featureContext, flipAnnotationAttributes);
    }

    @Override
    public boolean evaluate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
