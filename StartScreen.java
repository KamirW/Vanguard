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
		
		JLabel lblNewLabel = new JLabel("VANGUARD");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 49));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(76, 11, 338, 70);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(StartScreen.class.getResource("/images/VanguardLogoMedium.png")));
		lblNewLabel_1.setBounds(97, 97, 307, 284);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 38));
		btnNewButton.setBounds(170, 424, 150, 54);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked the start button");
				System.out.println("This should lead to Alex's screen");
			}
		});
		
		panel.add(btnNewButton);
	}
	
}
