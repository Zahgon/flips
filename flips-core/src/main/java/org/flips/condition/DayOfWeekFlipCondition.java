package org.flips.condition;

import org.flips.model.FeatureContext;
import org.flips.model.FlipAnnotationAttributes;
import org.flips.utils.DateTimeUtils;
import org.flips.utils.Utils;
import org.flips.utils.ValidationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.time.DayOfWeek;
import java.util.Arrays;

@Component
public class DayOfWeekFlipCondition implements FlipCondition {

    private static final Logger logger = LoggerFactory.getLogger(DayOfWeekFlipCondition.class);

    @Override
    public boolean evaluateCondition(FeatureContext featureContext, FlipAnnotationAttributes flipAnnotationAttributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
