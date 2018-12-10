import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener {

	Player player = new Player();
	
	public GamePanel() {
		addKeyListener(this);
		setBackground(new Color(64, 64, 64));
		setFocusable(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.yellow);
		player.draw(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int x=player.getX();
		int y=player.getY();
		int moveSpeed=5;
		
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			y=y-moveSpeed;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			y=y+moveSpeed;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			x=x-moveSpeed;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x=x+moveSpeed;
		}
		
		
		
		player.setXY(x, y);
		
		repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
