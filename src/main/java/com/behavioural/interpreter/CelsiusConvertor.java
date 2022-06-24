package com.behavioural.interpreter;

public class CelsiusConvertor implements TemperatureConvertor{
    @Override
    public String celsius(Double temp) {
        return Double.toString(temp) + "C";
    }

    @Override
    public String fahrenheit(Double temp) {
        return Double.toString(((temp-32) * 5.0)/9.0) + "C";
    }

    @Override
    public String kelvin(Double temp) {
        return Double.toString(temp - 273.15) + "C";
    }
}
