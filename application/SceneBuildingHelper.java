package application;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneBuildingHelper {

	public static void loadNewFrame(String fxmlFileName, String title) {
		Stage stage = new Stage();

		try {

			FXMLLoader loader = new FXMLLoader(LoginAsDoctorFrame.class.getResource(fxmlFileName));
			Parent root = loader.load();

			Scene scene = new Scene(root);

			stage.setTitle(title);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
