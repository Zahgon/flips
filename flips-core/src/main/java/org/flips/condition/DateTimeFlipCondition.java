package org.flips.condition;

import org.flips.model.FeatureContext;
import org.flips.model.FlipAnnotationAttributes;
import org.flips.utils.DateTimeUtils;
import org.flips.utils.ValidationUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;

@Component
public class DateTimeFlipCondition implements FlipCondition {

    private static final Logger logger = LoggerFactory.getLogger(DateTimeFlipCondition.class);

    @Override
    public boolean evaluateCondition(FeatureContext featureContext, FlipAnnotationAttributes flipAnnotationAttributes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean isCurrentDateTimeAfterOrEqualCutoffDateTime(ZonedDateTime cutoffDateTime, ZonedDateTime currentUtcTime) {
        logger.info("DateTimeFlipCondition: cutoffDateTime {}, currentUtcTime {}", cutoffDateTime, currentUtcTime);
        return currentUtcTime.isEqual(cutoffDateTime) || currentUtcTime.isAfter(cutoffDateTime);
    }

    private ZonedDateTime getCutoffDateTime(String datetime) {
        logger.info("DateTimeFlipCondition: parsing {}", datetime);
        try {
            return OffsetDateTime.parse(datetime).atZoneSameInstant(DateTimeUtils.UTC);
        } catch (DateTimeParseException e) {
            logger.error("Could not parse " + datetime + ", expected format yyyy-MM-ddTHH:mm:ssZ");
            throw e;
        }
    }
}
