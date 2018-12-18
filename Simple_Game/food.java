import java.awt.Graphics;

import javax.swing.ImageIcon;

public class food {

	int x;
	int y;
	int w;
	int h;
	ImageIcon sprite;
	
	public food() {
		x=100;
		y=700;
		w=50;
		h=50;
		sprite= new ImageIcon("food.png");
	}
	public void draw(Graphics g) {
		g.drawRect(x, y, w, h);
	}
	public void setXY(int newX, int newY) {
		x=newX;
		y=newY;
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	
}
