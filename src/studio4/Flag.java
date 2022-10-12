package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(.5, .5, 1, 1);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.circle(.5, .75, .05);
		StdDraw.line(.5, .7, .5, .4);
		StdDraw.line(.5, .6, .6, .65);
		StdDraw.line(.5, .6, .4, .65);
		StdDraw.line(.5, .4, .4, .3);
		StdDraw.line(.5, .4, .6, .3);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(.01);
		StdDraw.line(.25, .25, .75, .75);
		StdDraw.circle(.5, .5, .36);
		
	}
}