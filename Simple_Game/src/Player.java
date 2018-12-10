import java.awt.Graphics;

public class Player {

	int x;
	int y;
	int w;
	int h;
	
	public Player() {
		x=100;
		y=700;
		w=50;
		h=50;
	}
	
	public void draw(Graphics g) {
		g.drawRect(x, y, w, h);
	}
	
	public void setXY(int newX, int newY) {
		x=newX;
		y=newY;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}
