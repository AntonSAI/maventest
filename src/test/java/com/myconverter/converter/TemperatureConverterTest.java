package com.myconverter.converter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void convertToCelsius() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.convertToCelsius(50);
        assertEquals(10, result);
    }

    @Test
    void convertToFahrenheit() {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double result = temperatureConverter.convertToFahrenheit(10);
        assertEquals(50, result);
    }

    @Test
    void check() {
        TemperatureConverter temperatureConverter = Mockito.mock(TemperatureConverter.class);
        when(temperatureConverter.convertToCelsius(50.0)).thenReturn(10.0);
        verify(temperatureConverter).convertToCelsius(50.0);
        verify(temperatureConverter, atLeastOnce()).convertToCelsius(50.0);
    }
}