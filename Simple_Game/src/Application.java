import javax.swing.JFrame;

public class Application extends JFrame {

	public Application() {
		setSize(10000, 10000);
		setTitle("Game");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		GamePanel panel = new GamePanel();
		add(panel);
	}
	
	public static void main(String[] args) {
		Application application = new Application();
		application.setVisible(true);

	}

}
