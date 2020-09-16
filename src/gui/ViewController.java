package gui;

import gui.Util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	
	//Implementação dos text field + calculo básico//
	@FXML
	private TextField txtnum1;
	
	@FXML
	private TextField txtnum2;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btCalc;
	
	@FXML
	public void onBtCalcAction() {
		int num1 = Integer.parseInt(txtnum1.getText());
		int num2 = Integer.parseInt(txtnum2.getText());
		int soma = num1 + num2;
		labelResult.setText(String.valueOf(soma));		
	}
	
	//Implementação do choice box//
	@FXML
	private ChoiceBox<String> choicebox;

	public String cbItem1 = "Computador";
	public String cbItem2 = "Placa de video";
	public String cbItem3 = "Mouse";
	public String cbItem4 = "Teclado";
	
	public void onActionChoiceBox() {
		choicebox.getItems().clear();		
		choicebox.getItems().add(cbItem1);
		choicebox.getItems().add(cbItem2);
		choicebox.getItems().add(cbItem3);
		choicebox.getItems().add(cbItem4);
		choicebox.setValue(cbItem1);		
	}
	
	//Implementação do alerta//
	@FXML
	private Button btAlerta;
	
	@FXML
	public void onBtAlerta() {
		Alerts.showAlert("Alera", "Olá, planeta!", "Você clicou no botão, muito bem!", AlertType.INFORMATION);
	}
}
