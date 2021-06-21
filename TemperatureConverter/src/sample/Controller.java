package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import sample.converter.TemperatureConverter;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class Controller implements Initializable {

  public RadioButton celsiusRadioBtn;
  public TextField temperatureInputField;
  public Label resultLabel;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    temperatureInputField.textProperty().addListener((observable, oldValue, newValue) -> {
      if (!newValue.matches("\\d*")) {
        temperatureInputField.setText(newValue.replaceAll("[^\\d]", ""));
      }
    });
  }

  public void onConvertBtnClick(ActionEvent actionEvent) {
    TemperatureConverter converter = new TemperatureConverter();
    DecimalFormat df = new DecimalFormat("#.###");
    String temperatureToConvertAsString = temperatureInputField.getText();

    if (temperatureToConvertAsString.length() == 0) {
      return;
    }

    double temperatureToConvert = Double.parseDouble(temperatureToConvertAsString);
    double convertedTemperature;

    if (celsiusRadioBtn.isSelected()) {
      convertedTemperature = converter.toCelsius(temperatureToConvert);
    } else {
      convertedTemperature = converter.toFahrenheit(temperatureToConvert);
    }

    resultLabel.setText(df.format(convertedTemperature));
  }
}
