package com.myconverter.converter;

import com.myconverter.exception.IllegalNumberException;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LengthConverter {
    private static Logger log = Logger.getLogger(LengthConverter.class.getName());
    private final double KILOMETERS_TO_MILE = 0.62137;

    public double convertMileToKilometer(double mile) {
        log.info("Start method convertMileToKilometer");
        return new BigDecimal(mile / KILOMETERS_TO_MILE). setScale(3, RoundingMode.HALF_DOWN).doubleValue();
    }

    public double convertKilometerToMile(double kilometer) throws IllegalNumberException {
        log.info("Start method convertKilometerToMile");
        if (kilometer <= 0.0) {
            log.error("Illegal number");
            throw new IllegalNumberException("Illegal number", kilometer);
        } else {
            return new BigDecimal(kilometer * KILOMETERS_TO_MILE). setScale(3, RoundingMode.HALF_DOWN).doubleValue();
        }
    }
}
