import java.awt.EventQueue;

/**
 * 
 * @author Kamir Walton
 * 
 * This class is the beginning of the application wherein it instantiates the start Screen.
 *
 */
public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartScreen frame = new StartScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	}
}
