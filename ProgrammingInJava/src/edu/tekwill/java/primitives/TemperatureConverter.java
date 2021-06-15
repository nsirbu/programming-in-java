package edu.tekwill.java.primitives;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author nsirbu
 * @since 15.06.2021
 */
public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the temperature to convert to Celsius: ");
    int temperatureToConvert = sc.nextInt();

    double convertedTemperature = (5 * (temperatureToConvert - 32)) / 9d;
    System.out.println("Converted temperature: " + convertedTemperature);

    DecimalFormat dc = new DecimalFormat("#.##");
    System.out.println(dc.format(convertedTemperature));
  }
}
