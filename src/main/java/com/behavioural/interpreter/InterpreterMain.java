package com.behavioural.interpreter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Scanner;

public class InterpreterMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        System.out.println("Enter the conversion query:");
        Scanner scanner = new Scanner(System.in);

        String query = scanner.nextLine();
        String[] parts = query.split(" ");

        Double temperature = Double.parseDouble(parts[0]);
        String methodName = parts[1].toLowerCase(Locale.ROOT);
        String className = getClassName(parts[3]);

        Class tempClass = Class.forName(className);
        Constructor constructor = tempClass.getConstructor(null);
        TemperatureConvertor temperatureConvertor = (TemperatureConvertor) constructor.newInstance(null);

        Class[] params = {Double.class};
        Method method = tempClass.getDeclaredMethod(methodName, params);
        String convertedTemp = (String) method.invoke(temperatureConvertor, temperature);

        System.out.println(parts[0] + " " + parts[1] + " equals " +  convertedTemp);
    }

    public static String getClassName(String conversionType) {
        return "com.behavioural.interpreter." + Character.toUpperCase(conversionType.charAt(0)) + conversionType.toLowerCase(Locale.ROOT).substring(1) + "Convertor";
    }
}
