package com.behavioural.interpreter;

public class KelvinConvertor implements TemperatureConvertor{
    @Override
    public String celsius(Double temp) {
        return Double.toString(temp + 273.15) + "K";
    }

    @Override
    public String kelvin(Double temp) {
        return Double.toString(temp) + "K";
    }

    @Override
    public String fahrenheit(Double temp) {
        return Double.toString((((temp-32.0) * 5.0)/9.0) + 273.15) + "K";
    }
}
