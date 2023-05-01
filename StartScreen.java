import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Kamir Walton
 * 
 * This class creates the GUI for the start screen
 *
 */
public class StartScreen extends JFrame {

	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public StartScreen() {
		setTitle("Vanguard Application");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StartScreen.class.getResource("/images/VanguardLogoSmaller.png")));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 593);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 493, 554);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitleLabel = new JLabel("VANGUARD");
		lblTitleLabel.setFont(new Font("Arial Black", Font.PLAIN, 49));
		lblTitleLabel.setForeground(Color.WHITE);
		lblTitleLabel.setBounds(76, 11, 338, 70);
		panel.add(lblTitleLabel);
		
		JLabel lblLogoLabel = new JLabel("");
		lblLogoLabel.setIcon(new ImageIcon(StartScreen.class.getResource("/images/VanguardLogoMedium.png")));
		lblLogoLabel.setBounds(97, 97, 307, 284);
		panel.add(lblLogoLabel);
		
		JButton btnStartButton = new JButton("Start");
		btnStartButton.setForeground(Color.BLACK);
		btnStartButton.setBackground(Color.WHITE);
		btnStartButton.setFont(new Font("Arial Black", Font.PLAIN, 38));
		btnStartButton.setBounds(170, 424, 150, 54);
		btnStartButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame();
				setVisible(false);
				mf.setVisible(true);
			}
		});
		
		panel.add(btnStartButton);
	}
	
}
