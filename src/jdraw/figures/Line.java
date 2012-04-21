package jdraw.figures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.util.List;

import jdraw.framework.FigureHandle;

@SuppressWarnings("serial")
public class Line extends AbstractFigure {
	
	private Line2D.Double line;
	
	public Line(Point p1, Point p2){
		line = new Line2D.Double(p1, p2);
	}
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawLine((int) line.x1, (int) line.y1, (int) line.x2, (int) line.y2);

	}

	@Override
	public void move(int dx, int dy) {
		line.x1 += dx;
		line.x2 += dx;
		line.y1 += dy;
		line.y2 += dy;
		notifyListeners();
	}
	
	private static final int TOL = 6;
	@Override
	public boolean contains(int x, int y) {
		return line.ptSegDist(x, y) <= TOL;
	}

	@Override
	public void setBounds(Point origin, Point corner) {
		line.setLine(origin, corner);
		notifyListeners();
	}

	@Override
	public Rectangle getBounds() {
		return line.getBounds();
	}

	@Override
	public List<FigureHandle> getHandles() {
		return null;
	}
}
