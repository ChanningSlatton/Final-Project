import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Player {

	int x;
	int y;
	int w;
	int h;
	ImageIcon sprite;
	
	public Player() {
		x=0;
		y=650;
		w=50;
		h=50;
		sprite= new ImageIcon("h.png");
	}
	
	public void draw(Graphics g) {
		g.drawRect(x, y, w, h);
		g.drawImage(sprite.getImage(),x,y,w,h,null);
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
