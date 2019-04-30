package test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class former extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, 1000, 800, Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.show();

		Circle circle = new Circle();
		circle.setRadius(50);
		circle.setTranslateX(500);
		circle.setTranslateY(400);
		circle.setFill(Color.BROWN);

		Rectangle rectangle = new Rectangle();
		rectangle.setWidth(100);
		rectangle.setHeight(50);
		rectangle.setFill(Color.BLUEVIOLET);
		rectangle.setTranslateX(450);
		rectangle.setTranslateY(400);

		Polygon polygon = new Polygon(0, 0, 0, 100, 100, 100);

		// polygon.getPoints().add(0.0);//X
		// polygon.getPoints().add(0.0);//Y

		// polygon.getPoints().add(0.0);//X
		// polygon.getPoints().add(100.0);//Y

		// polygon.getPoints().add(100.0);//X
		// polygon.getPoints().add(100.0);//Y

		Star star = new Star(50);
		star.setTranslateX(700);
		star.setTranslateY(500);
		star.setFill(Color.DARKGOLDENROD);

		Car car = new Car(Color.ALICEBLUE);
		car.setTranslateX(400);
		car.setTranslateY(500);

		Arc arc = new Arc();

		arc.setCenterX(50.0f);
		arc.setCenterY(50.0f);
		arc.setRadiusX(25.0f);
		arc.setRadiusY(25.0f);
		arc.setStartAngle(45.0f);
		arc.setLength(270.0f);
		arc.setType(ArcType.ROUND);
		arc.setTranslateX(200);
		arc.setTranslateY(200);
		arc.setFill(Color.AQUA);

		root.getChildren().addAll(circle, rectangle, polygon, star, car, arc);

	}

	public static void main(String[] args) {
		launch();
	}

}
