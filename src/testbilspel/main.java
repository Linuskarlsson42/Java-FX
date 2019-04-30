package testbilspel;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Group root = new Group();
		Scene scene = new Scene(root,1000,800,Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		Circle circle = new Circle();
		circle.setRadius(100);
		circle.setTranslateX(500);
		circle.setTranslateY(50);
		circle.setFill(Color.YELLOW);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(1000);
		rectangle.setHeight(500);
		rectangle.setFill(Color.GREEN);
		rectangle.setTranslateY(600);
		
		
		
		car car = new car(Color.ALICEBLUE);
		car.setTranslateX(400);
		car.setTranslateY(500);
		
		root.getChildren().addAll(circle, rectangle, car);		
		
		
		
		
	}
	
	public static void main(String[] args) {
		launch();
	}
}