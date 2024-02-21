package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(173, 216, 230);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.25);
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledEllipse(0.5,  0.5, 0.2, 0.12);
		StdDraw.setPenColor(0, 120, 0);
		double[] x = {-0.1, 0.45, 0.17};
		double[] y = {0.25, 0.25, 0.5};
		StdDraw.filledPolygon(x, y);
		double[] x1 = {1 - -0.1, 1 - 0.45, 1 - 0.17};
		double[] y1 = {0.25, 0.25, 0.5};
		StdDraw.filledPolygon(x1, y1);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5,  0.89, 0.5, 0.10);
		StdDraw.filledRectangle(0.5,  1 - 0.89, 0.5, 0.10);
		StdDraw.setPenRadius(0.1);
		StdDraw.rectangle(0.5, 0.5, 0.46, 0.26);

	}
}