package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPage {

	@FXML
	private TextField emailFieldBtn;

	@FXML
	private Button goBackBtn;

	@FXML
	private Button loginPatientBtn;

	@FXML
	private Button loginPatientBtn1;

	@FXML
	private Button loginPatientBtn2;

	@FXML
	private PasswordField passwordFieldBtn;

	@FXML
	void goBack(ActionEvent event) {

	}

	@FXML
	void login(ActionEvent event) {

		if (emailFieldBtn.getText().contentEquals("admin") && passwordFieldBtn.getText().contentEquals("admin")) {
			SceneBuildingHelper.loadNewFrame(null, null);
		}

	}

}
