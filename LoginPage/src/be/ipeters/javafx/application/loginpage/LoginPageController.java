package be.ipeters.javafx.application.loginpage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginPageController implements Initializable {
	@FXML
	private Button addButton;

	@FXML
	private TextField firstNumberTextField, secondNumberTextField, resultTextField;

	@FXML
	private void handleAdditionAction(ActionEvent event) {
		double first = Double.parseDouble(firstNumberTextField.getText());
		double second = Double.parseDouble(secondNumberTextField.getText());
		double result = first + second;
		resultTextField.setText(String.valueOf(result));
	}

	@FXML
	private void handleMultiplicationAction(ActionEvent event) {
		double first = Double.parseDouble(firstNumberTextField.getText());
		double second = Double.parseDouble(secondNumberTextField.getText());
		double result = first * second;
		resultTextField.setText(String.valueOf(result));
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
