package Flag;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class grafik extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root,500,500,Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();
		root.getChildren().add(flagmaker.greece());
		
	}
	
	public static void main(String[] args) {
		launch();
		
	}
	
}
