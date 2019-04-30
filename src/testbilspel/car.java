package testbilspel;

	import javafx.scene.Group;
	import javafx.scene.paint.Color;
	import javafx.scene.shape.Circle;
	import javafx.scene.shape.Rectangle;

	public class car extends Group{
		
		public car(Color c){
			
			Rectangle top = new Rectangle();
			top.setWidth(50);
			top.setHeight(25);
			top.setTranslateX(25);
			
			Rectangle body = new Rectangle();
			body.setWidth(100);
			body.setHeight(25);
			body.setTranslateY(25);
			
			Circle tireLeft = new Circle();
			tireLeft.setRadius(12.5);
			tireLeft.setTranslateX(20);
			tireLeft.setTranslateY(50);
			
			Circle tireRight = new Circle();
			tireLeft.setRadius(12.5);
			tireLeft.setTranslateX(80);
			tireLeft.setTranslateY(50);
			
			top.setFill(c);
			body.setFill(c);
			
			this.getChildren().addAll(top, body, tireLeft, tireRight);
			
		}
		
	}

