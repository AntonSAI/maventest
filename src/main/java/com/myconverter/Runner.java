package com.myconverter;

import com.myconverter.converter.LengthConverter;
import com.myconverter.converter.TemperatureConverter;
import com.myconverter.exception.IllegalNumberException;

public class Runner {
    public static void main(String[] args) {
        TemperatureConverter t = new TemperatureConverter();
        System.out.println(t.convertToCelsius(50));
        System.out.println(t.convertToFahrenheit(10));

        LengthConverter l = new LengthConverter();
        try {
            System.out.println(l.convertMileToKilometer(54));
            System.out.println(l.convertKilometerToMile(0));
        } catch (IllegalNumberException e) {
            e.printStackTrace();
        }
    }
}
