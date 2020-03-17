package com.myconverter.converter;

import com.myconverter.exception.IllegalNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthConverterTest {

    @Test
    void convertMileToKilometer() {
        LengthConverter lengthConverter = new LengthConverter();
        double result = lengthConverter.convertMileToKilometer(54);
        assertEquals(86.905, result);
    }

    @Test
    void convertKilometerToMile() throws IllegalNumberException {
        LengthConverter lengthConverter = new LengthConverter();
        double result = lengthConverter.convertKilometerToMile(86.905);
        assertEquals(54, result);
    }

    void throwsIllegalNumberException() {
        LengthConverter lengthConverter = new LengthConverter();
        assertThrows(IllegalNumberException.class, () -> lengthConverter.convertKilometerToMile(-1.0));
    }
}