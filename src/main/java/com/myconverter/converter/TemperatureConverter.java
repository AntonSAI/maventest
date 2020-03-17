package com.myconverter.converter;

import org.apache.log4j.Logger;

public class TemperatureConverter {

    private static Logger log = Logger.getLogger(TemperatureConverter.class.getName());

    private final int DIFFERENCE_BETWEEN_F_C = 32;
    private final double TEMP_FACTOR = 1.8;

    public double convertToCelsius(double degree) {
//        log.info("Start method convertToCelsius");
        return (degree - DIFFERENCE_BETWEEN_F_C) / TEMP_FACTOR;
    }

    public double convertToFahrenheit(double degree) {
//        log.info("Start method convertToFahrenheit");
        return degree * TEMP_FACTOR + DIFFERENCE_BETWEEN_F_C;
    }

}
