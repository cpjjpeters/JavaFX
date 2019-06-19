package be.ipeters.javafx.application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController implements Initializable {
	@FXML
	   private Button addButton;
	  
	   @FXML
	   private TextField firstNumberTextField,secondNumberTextField, resultTextField;
	  
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	// When user click on myButton
	   // this method will be called.
	   public void doAdd(ActionEvent event) {
	       System.out.println("Button Clicked!");
	      
	       
	      
	      
	        
	        // Show in VIEW
	       resultTextField.setText("output");
	      
	   }

}
