package be.ipeters.javafx.application.loginpage;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginPageController implements Initializable {
	@FXML
	private Button addButton;

	@FXML
	private TextField firstNumberTextField, secondNumberTextField, resultTextField;
	@FXML
	private Label label;
	@FXML
	private void handleLoginAction(ActionEvent event) {
		label.setText("Logged in");
		System.out.println("logging in ...");
	}

	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
