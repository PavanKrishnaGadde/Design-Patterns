package com.behavioural.interpreter;

public class FahrenheitConvertor implements TemperatureConvertor{
    @Override
    public String celsius(Double temp) {
        return Double.toString((temp*9.0)/5.0 + 32.0) + "F";
    }

    @Override
    public String fahrenheit(Double temp) {
        return Double.toString(temp) + "F";
    }

    @Override
    public String kelvin(Double temp) {
        return Double.toString((((temp-273.15)*9.0)/5.0)+32.0) + "F";
    }
}
