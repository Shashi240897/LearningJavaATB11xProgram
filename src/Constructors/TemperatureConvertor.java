package Constructors;
//Class Name: TemperatureConverter
//        Write a class with two methods:
//
//        convertToCelsius(double fahrenheit)
//
//        convertToCelsius(double fahrenheit)
//
//        These should just print the converted values.
//        ➡️ No need to store anything, so no constructor required.


public class TemperatureConvertor {
    public double convertToCelsius(double fahrenheit){
        double cel = (fahrenheit - 32) * 5/9;

        return cel;
    }
    public double convertToFahrenheit(double celsius){
double fah = (celsius * 9/5)+32;
        return fah;
    }

    public static void main(String[] args) {

        TemperatureConvertor tc = new TemperatureConvertor();
        System.out.println("Celsius: "+tc.convertToCelsius(32.5));
        System.out.println("Fahrenheit:"+tc.convertToFahrenheit(35.6));
    }

}
