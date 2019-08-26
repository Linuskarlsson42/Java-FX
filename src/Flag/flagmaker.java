package Flag;

import javafx.geometry.NodeOrientation;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import test.Star;

public class flagmaker {
	public static Flag swe() {

		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.BLUE);

		Rectangle Hstripe = new Rectangle();
		Hstripe.setWidth(300);
		Hstripe.setHeight(40);
		Hstripe.setTranslateY(80);
		Hstripe.setFill(Color.YELLOW);

		Rectangle Vstripe = new Rectangle();
		Vstripe.setWidth(40);
		Vstripe.setHeight(200);
		Vstripe.setTranslateX(80);
		Vstripe.setFill(Color.YELLOW);

		flag.getChildren().addAll(bg, Vstripe, Hstripe);

		return flag;
	}

	public static Flag laos() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();

		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.RED);

		Rectangle vs = new Rectangle();
		vs.setTranslateY(40);
		vs.setWidth(300);
		vs.setHeight(112.5);
		vs.setFill(Color.NAVY);

		Circle m = new Circle();

		m.setRadius(40);
		m.setTranslateX(150);
		m.setTranslateY(95);
		m.setFill(Color.FLORALWHITE);

		flag.getChildren().addAll(bg, vs, m);

		return flag;
	}

	public static Flag japan() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.WHITE);

		Circle m = new Circle();
		m.setRadius(40);
		m.setTranslateX(150);
		m.setTranslateY(95);
		m.setFill(Color.RED);

		flag.getChildren().addAll(bg, m);

		return flag;
	}

	public static Flag greenland() {
		Flag flag = new Flag();

		Rectangle topRc = new Rectangle();

		topRc.setWidth(300);
		topRc.setHeight(200);
		topRc.setFill(Color.WHITE);

		Rectangle botRc = new Rectangle();
		botRc.setWidth(300);
		botRc.setHeight(100);
		botRc.setTranslateY(100);
		botRc.setFill(Color.RED);

		Arc topAc = new Arc();
		topAc.setCenterX(50.0f);
		topAc.setCenterY(50.0f);
		topAc.setRadiusX(60.0f);
		topAc.setRadiusY(60.0f);
		topAc.setStartAngle(0);
		topAc.setLength(180.0f);
		topAc.setTranslateX(80);
		topAc.setTranslateY(51);
		topAc.setType(ArcType.ROUND);
		topAc.setFill(Color.RED);

		Arc botAc = new Arc();
		botAc.setCenterX(50.0f);
		botAc.setCenterY(50.0f);
		botAc.setRadiusX(60.0f);
		botAc.setRadiusY(60.0f);
		botAc.setStartAngle(180.0f);
		botAc.setLength(180.0f);
		botAc.setTranslateX(80);
		botAc.setTranslateY(50);
		botAc.setType(ArcType.ROUND);
		botAc.setFill(Color.WHITE);

		flag.getChildren().addAll(topRc, botRc, topAc, botAc);

		return flag;

	}

	public static Flag congo() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.YELLOW);

		Polygon topPg = new Polygon(0, 200, 200, 0, 0, 0);
		topPg.setFill(Color.GREEN);

		Polygon botPg = new Polygon(100, 200, 300, 200, 300, 0);
		botPg.setFill(Color.RED);

		flag.getChildren().addAll(bg, topPg, botPg);

		return flag;

	}

	public static Flag togo() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.GREEN);

		Rectangle vTop = new Rectangle();
		vTop.setWidth(300);
		vTop.setHeight(40);
		vTop.setFill(Color.YELLOW);
		vTop.setTranslateY(40);

		Rectangle vBot = new Rectangle();
		vBot.setWidth(300);
		vBot.setHeight(40);
		vBot.setFill(Color.YELLOW);
		vBot.setTranslateY(120);

		Rectangle sq = new Rectangle();
		sq.setWidth(120);
		sq.setHeight(120);
		sq.setFill(Color.RED);

		Star st = new Star(40);
		st.setTranslateX(60);
		st.setTranslateY(60);
		st.setFill(Color.WHITE);

		flag.getChildren().addAll(bg, vTop, sq, vBot, st);

		return flag;

	}

	public static Flag uk() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.WHITE);

		Rectangle crossH = new Rectangle();
		crossH.setWidth(30);
		crossH.setHeight(200);
		crossH.setFill(Color.rgb(212, 0, 37));
		crossH.setTranslateX(140);

		Rectangle crossV = new Rectangle();
		crossV.setWidth(300);
		crossV.setHeight(40);
		crossV.setFill(Color.rgb(212, 0, 37));
		crossV.setTranslateY(80);

		Polygon sT1 = new Polygon(0, 60, 0, 20, 70, 60);
		sT1.setFill(Color.rgb(28, 40, 130));

		Polygon sT2 = new Polygon(0, 180, 0, 140, 70, 140);
		sT2.setFill(Color.rgb(28, 40, 130));

		Polygon sT3 = new Polygon(0, 60, 0, 20, 70, 60);
		sT3.setFill(Color.rgb(28, 40, 130));
		sT3.setTranslateX(230);
		sT3.setTranslateY(120);
		sT3.setRotate(180);

		Polygon sT4 = new Polygon(0, 180, 0, 140, 70, 140);
		sT4.setFill(Color.rgb(28, 40, 130));
		sT4.setTranslateX(230);
		sT4.setTranslateY(-120);
		sT4.setRotate(180);

		Polygon bT1 = new Polygon(125, 0, 125, 63, 30, 0);
		bT1.setFill(Color.rgb(28, 40, 130));

		Polygon bT2 = new Polygon(185, 0, 185, 63, 270, 0);
		bT2.setFill(Color.rgb(28, 40, 130));

		Polygon bT3 = new Polygon(185, 0, 185, 63, 270, 0);
		bT3.setFill(Color.rgb(28, 40, 130));
		bT3.setTranslateX(-145);
		bT3.setTranslateY(137);
		bT3.setRotate(180);

		Polygon bT4 = new Polygon(125, 0, 125, 63, 30, 0);
		bT4.setFill(Color.rgb(28, 40, 130));
		bT4.setTranslateX(145);
		bT4.setTranslateY(137);
		bT4.setRotate(180);

		Polygon line1 = new Polygon(0, 15, 80, 60, 80, 60, 100, 60, 0, 0);
		line1.setFill(Color.rgb(212, 0, 37));

		Polygon line2 = new Polygon(0, 15, 80, 60, 80, 60, 100, 60, 0, 0);
		line2.setFill(Color.rgb(212, 0, 37));
		line2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		line2.setTranslateX(200);

		Polygon line3 = new Polygon(0, 15, 80, 60, 80, 60, 100, 60, 0, 0);
		line3.setFill(Color.rgb(212, 0, 37));
		line3.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		line3.setTranslateY(140);
		line3.setRotate(180);

		Polygon line4 = new Polygon(0, 15, 80, 60, 80, 60, 100, 60, 0, 0);
		line4.setFill(Color.rgb(212, 0, 37));
		line4.setTranslateX(200);
		line4.setTranslateY(140);
		line4.setRotate(180);

		flag.getChildren().addAll(bg, crossH, crossV, sT1, sT2, sT3, sT4, bT1, bT2, bT3, bT4, line1, line2, line3,
				line4);

		return flag;
	}

	public static Flag nKorea() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.WHITE);

		Rectangle vbTop = new Rectangle();
		vbTop.setWidth(300);
		vbTop.setHeight(40);
		vbTop.setFill(Color.NAVY);

		Rectangle vbBot = new Rectangle();
		vbBot.setWidth(300);
		vbBot.setHeight(40);
		vbBot.setFill(Color.NAVY);
		vbBot.setTranslateY(160);

		Rectangle vS = new Rectangle();
		vS.setWidth(300);
		vS.setHeight(110);
		vS.setFill(Color.RED);
		vS.setTranslateY(45);

		Circle mit = new Circle();
		mit.setRadius(40);
		mit.setTranslateX(100);
		mit.setTranslateY(100);
		mit.setFill(Color.WHITE);

		Star s = new Star(35);
		s.setTranslateX(100);
		s.setTranslateY(100);
		s.setFill(Color.RED);

		flag.getChildren().addAll(bg, vbTop, vbBot, vS, mit, s);

		return flag;
	}

	public static Flag china() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.RED);

		Star bS = new Star(40);
		bS.setFill(Color.GOLD);
		bS.setTranslateX(60);
		bS.setTranslateY(60);

		Star sS1 = new Star(15);
		sS1.setFill(Color.GOLD);
		sS1.setTranslateX(125);
		sS1.setTranslateY(23);
		sS1.setRotate(30);

		Star sS2 = new Star(15);
		sS2.setFill(Color.GOLD);
		sS2.setTranslateX(150);
		sS2.setTranslateY(53);
		sS2.setRotate(330);

		Star sS3 = new Star(15);
		sS3.setFill(Color.GOLD);
		sS3.setTranslateX(150);
		sS3.setTranslateY(90);
		sS3.setRotate(0);

		Star sS4 = new Star(15);
		sS4.setFill(Color.GOLD);
		sS4.setFill(Color.GOLD);
		sS4.setTranslateX(125);
		sS4.setTranslateY(120);
		sS4.setRotate(30);

		flag.getChildren().addAll(bg, bS, sS1, sS2, sS3, sS4);

		return flag;
	}

	public static Flag benim() {
		Flag flag = new Flag();

		Rectangle green = new Rectangle();
		green.setWidth(100);
		green.setHeight(200);
		green.setFill(Color.GREEN);

		Rectangle red = new Rectangle();
		red.setWidth(200);
		red.setHeight(100);
		red.setFill(Color.RED);
		red.setTranslateY(100);
		red.setTranslateX(100);

		Rectangle yellow = new Rectangle();
		yellow.setWidth(200);
		yellow.setHeight(100);
		yellow.setFill(Color.YELLOW);
		yellow.setTranslateX(100);

		flag.getChildren().addAll(red, yellow, green);

		return flag;
	}

	public static Flag cuba() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.DARKBLUE);

		Rectangle sW = new Rectangle();
		sW.setWidth(300);
		sW.setHeight(40);
		sW.setFill(Color.WHITE);
		sW.setTranslateY(40);

		Rectangle sW2 = new Rectangle();
		sW2.setWidth(300);
		sW2.setHeight(40);
		sW2.setFill(Color.WHITE);
		sW2.setTranslateY(120);

		Polygon rP = new Polygon(0, 0, 0, 200, 0, 200, 150, 100);
		rP.setFill(Color.RED);

		Star s = new Star(40);
		s.setTranslateX(50);
		s.setTranslateY(100);
		s.setFill(Color.WHITE);

		flag.getChildren().addAll(bg, sW, sW2, rP, s);

		return flag;
	}

	public static Flag greece() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.BLUE);

		Rectangle vS1 = new Rectangle();
		vS1.setWidth(300);
		vS1.setHeight(22);
		vS1.setTranslateY(22);
		vS1.setFill(Color.WHITE);

		Rectangle vS2 = new Rectangle();
		vS2.setWidth(300);
		vS2.setHeight(22);
		vS2.setTranslateY(66);
		vS2.setFill(Color.WHITE);

		Rectangle vS3 = new Rectangle();
		vS3.setWidth(300);
		vS3.setHeight(22);
		vS3.setTranslateY(110);
		vS3.setFill(Color.WHITE);

		Rectangle vS4 = new Rectangle();
		vS4.setWidth(300);
		vS4.setHeight(22);
		vS4.setTranslateY(154);
		vS4.setFill(Color.WHITE);

		Rectangle sq = new Rectangle();
		sq.setWidth(110);
		sq.setHeight(110);
		sq.setFill(Color.BLUE);

		Rectangle sqcV = new Rectangle();
		sqcV.setWidth(20);
		sqcV.setHeight(110);
		sqcV.setFill(Color.WHITE);
		sqcV.setTranslateX(44);

		Rectangle sqcH = new Rectangle();
		sqcH.setWidth(110);
		sqcH.setHeight(20);
		sqcH.setFill(Color.WHITE);
		sqcH.setTranslateY(44);

		flag.getChildren().addAll(bg, vS1, vS2, vS3, vS4, sq, sqcV, sqcH);

		return flag;

	}

	public static Flag sAfrika() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.GREEN);

		Polygon bt = new Polygon(0, 40, 100, 100, 0, 160);

		Polygon ys = new Polygon(0, 25, 0, 40, 100, 100, 100, 100, 115, 100, 0, 30);
		ys.setFill(Color.YELLOW);

		Polygon ys2 = new Polygon(0, 25, 0, 40, 100, 100, 100, 100, 115, 100, 0, 30);
		ys2.setFill(Color.YELLOW);
		ys2.setRotate(180);
		ys2.setTranslateY(75);
		ys2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);

		Polygon ws1 = new Polygon(33, 0, 48, 0, 150, 60, 150, 70, 33, 0);
		ws1.setFill(Color.WHITE);

		Polygon ws2 = new Polygon(150, 70, 150, 60, 300, 60, 300, 70, 150, 70);
		ws2.setFill(Color.WHITE);

		Polygon ws3 = new Polygon(33, 0, 48, 0, 150, 60, 150, 70, 33, 0);
		ws3.setFill(Color.WHITE);
		ws3.setTranslateY(130);
		ws3.setRotate(180);
		ws3.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);

		Polygon ws4 = new Polygon(150, 70, 150, 60, 300, 60, 300, 70, 150, 70);
		ws4.setFill(Color.WHITE);
		ws4.setTranslateY(70);

		Polygon b = new Polygon(300, 60, 300, 0, 48, 0, 150, 60, 300, 60);
		b.setFill(Color.BLUE);
		b.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		b.setTranslateY(140);
		b.setRotate(180);

		Polygon r = new Polygon(300, 60, 300, 0, 48, 0, 150, 60, 300, 60);
		r.setFill(Color.RED);

		flag.getChildren().addAll(bg, bt, ys, ys2, ws1, ws2, ws3, ws4, b, r);

		return flag;
	}

	public static Flag macadonia() {
		Flag flag = new Flag();

		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.RED);

		Circle mit = new Circle();
		mit.setRadius(30);
		mit.setTranslateX(150);
		mit.setTranslateY(100);
		mit.setFill(Color.GOLDENROD);

		Polygon m1 = new Polygon(135, 200, 165, 200, 155, 133, 145, 133);
		m1.setFill(Color.GOLDENROD);
		
		Polygon d1 = new Polygon(0, 200, 40, 200, 130, 125, 125, 120);
		d1.setFill(Color.GOLDENROD);
		
		Polygon v1 = new Polygon(0, 120, 0, 80, 119, 95, 119, 105);
		v1.setFill(Color.GOLDENROD);
		
		Polygon m2 = new Polygon(135, 200, 165, 200, 155, 133, 145, 133);
		m2.setFill(Color.GOLDENROD);
		m2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		m2.setRotate(180);
		m2.setTranslateY(-133);
		
		Polygon d2 = new Polygon(0, 200, 40, 200, 130, 125, 125, 120);
		d2.setFill(Color.GOLDENROD);
		d2.setTranslateY(-120);
		d2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		d2.setRotate(180);
		
		Polygon v2 = new Polygon(0, 120, 0, 80, 119, 95, 119, 105);
		v2.setFill(Color.GOLDENROD);
		v2.setRotate(180);
		v2.setTranslateX(181);
		
		Polygon d3 = new Polygon(0, 200, 40, 200, 130, 125, 125, 120);
		d3.setFill(Color.GOLDENROD);
		d3.setTranslateY(-120);
		d3.setTranslateX(171);
		d3.setRotate(180);
		
		
		
		
		Polygon d4 = new Polygon(0, 200, 40, 200, 130, 125, 125, 120);
		d4.setFill(Color.GOLDENROD);
		d4.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		d4.setTranslateX(171);
		
		
		
		flag.getChildren().addAll(bg, mit, m1, d1, v1, m2, d2, v2, d3, d4);

		return flag;
	}

	public static Flag frankrike() {
		Flag flag = new Flag();
		Rectangle bg = new Rectangle();
		bg.setWidth(300);
		bg.setHeight(200);
		bg.setFill(Color.WHITE);
		
		Rectangle b = new Rectangle();
		b.setWidth(100);
		b.setHeight(200);
		b.setFill(Color.BLUE);
		
		Rectangle r= new Rectangle();
		r.setWidth(100);
		r.setHeight(200);
		r.setFill(Color.RED);
		r.setTranslateX(200);
		
		flag.getChildren().addAll(bg, b, r);
		
		return flag;
		
	}
	
	public static Flag mars() {
		Flag flag = new Flag();

		Rectangle red = new Rectangle();
		red.setWidth(100);
		red.setHeight(200);
		red.setFill(Color.rgb(183, 40, 26));

		Rectangle green = new Rectangle();
		green.setWidth(100);
		green.setHeight(200);
		green.setTranslateX(100);
		green.setFill(Color.rgb(48, 106, 55));

		Rectangle blue = new Rectangle();
		blue.setWidth(100);
		blue.setHeight(200);
		blue.setTranslateX(200);
		blue.setFill(Color.rgb(27, 63, 125));

		flag.getChildren().addAll(red, green, blue);

		return flag;

	}
	
}
