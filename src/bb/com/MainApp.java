package bb.com;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MainApp extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Resources/fxml/Scene.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add("/Resources/styles/Styles.css");
			Image icon = new Image("/Resources/icons/LoginPage.png");
			stage.getIcons().add(icon);
			stage.setResizable(false);
			stage.setTitle("Login");
			stage.setScene(scene);
			stage.show();
			Media someSound = new Media(getClass().getResource("/Resources/audio/Welcome.mp3").toString());    
			MediaPlayer mp = new MediaPlayer(someSound);
			mp.play();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}

}
