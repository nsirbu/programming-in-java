//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package sample.converter;

/**
 * @author nsirbu
 * @since 21.06.2021
 */
public class TemperatureConverter {
  public double toCelsius(double temperatureToConvert) {
    return (5 * (temperatureToConvert - 32)) / 9d;
  }

  public double toFahrenheit(double temperatureToConvert) {
    return (9 * temperatureToConvert + (32 * 5)) / 5d;
  }
}
