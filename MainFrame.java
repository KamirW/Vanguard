import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.DefaultListModel;
import java.awt.Font;

public class MainFrame extends JFrame {

	private JPanel ctpMain;
	private JTextField txtUser;
	private JLabel lblUserName;
	private JButton buttonSave;
	private JLabel lblUserType;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton buttonUser;
	private JRadioButton buttonManager;
	private JTextField txtTeamName;
	
	League league = new League("", new Team(""));

	DefaultListModel<Player> playersList = new DefaultListModel<Player>();
	private JLabel lblNewLabel;

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/images/VanguardLogoSmaller.png")));
		
		intitComponents(); 
		createEvents();
	}

	//Contains code for creating events//
	private void createEvents() {
		
		buttonSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DisplayPlayersScreen.team2 = new Team(txtTeamName.getText());
				DisplayPlayersScreen.username = txtUser.getText();
				DisplayPlayersScreen dps = new DisplayPlayersScreen();
				setVisible(false);
				dps.setVisible(true);
				
				league.addUser(new User(txtUser.getText()));
				league.addTeam(new Team(txtTeamName.getText()));
				
				
				
				
			
			}
		});
		
	}

	//Contains code for creating and initializing components//
	private void intitComponents() {
		
		//setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/wbResources/vaHelmet.png")));
		setTitle("Vanguard App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 609);
		ctpMain = new JPanel();
		ctpMain.setBackground(Color.DARK_GRAY);
		ctpMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(ctpMain);
		
		buttonSave = new JButton("Save");
		buttonSave.setBackground(Color.RED);
		buttonSave.setFont(new Font("Arial Black", Font.BOLD, 15));
		buttonSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		lblUserName = new JLabel("Username:");
		lblUserName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblUserName.setForeground(Color.WHITE);
		
		txtUser = new JTextField();
		txtUser.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txtUser.setColumns(10);
		
		lblUserType = new JLabel("User Type:");
		lblUserType.setForeground(Color.WHITE);
		lblUserType.setFont(new Font("Arial Black", Font.PLAIN, 15));
		
		buttonUser = new JRadioButton("User");
		buttonUser.setSelected(true);
		buttonGroup.add(buttonUser);
		
		buttonManager = new JRadioButton("Manager");
		buttonGroup.add(buttonManager);
		
		JLabel lblTeamName = new JLabel("Team Name:");
		lblTeamName.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblTeamName.setForeground(Color.WHITE);
		
		txtTeamName = new JTextField();
		txtTeamName.setColumns(10);
		
		lblNewLabel = new JLabel("Vanguard");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 49));
		//lblNewLabel.setIcon(new ImageIcon(MainFrame.class.getResource("/wbResources/vaHelmet.png")));
		GroupLayout gl_ctpMain = new GroupLayout(ctpMain);
		gl_ctpMain.setHorizontalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addGap(117)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUserType)
								.addComponent(lblTeamName))
							.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_ctpMain.createSequentialGroup()
									.addGap(14)
									.addComponent(buttonUser)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(buttonManager))
								.addGroup(gl_ctpMain.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_ctpMain.createParallelGroup(Alignment.TRAILING)
										.addComponent(buttonSave, GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
										.addComponent(txtTeamName, Alignment.LEADING, 178, 178, 178)))))
						.addGroup(gl_ctpMain.createSequentialGroup()
							.addComponent(lblUserName)
							.addGap(18)
							.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
					.addGap(232))
				.addGroup(Alignment.TRAILING, gl_ctpMain.createSequentialGroup()
					.addContainerGap(185, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
					.addGap(159))
		);
		gl_ctpMain.setVerticalGroup(
			gl_ctpMain.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_ctpMain.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserName)
						.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserType)
						.addComponent(buttonUser)
						.addComponent(buttonManager))
					.addGap(85)
					.addGroup(gl_ctpMain.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTeamName)
						.addComponent(txtTeamName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(73)
					.addComponent(buttonSave, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
					.addGap(72))
		);
		
		
		
		initTeamList();
		ctpMain.setLayout(gl_ctpMain);
		
	}

	private void initTeamList() {
		
		Player p1 = new Player("Patrick Mahomes", "QB", 31.42);
		Player p2 = new Player("Nick Chubb", "RB1", 12.44);
		Player p3 = new Player("Justin Jefferson", "WR1", 9.10);
		Player p4 = new Player("AJ Brown", "WR2", 13.10);
		Player p5 = new Player("Travis Kelce", "TE", 13.70);
		Player p6 = new Player("Tyreek Hill", "FLEX", 25.67);
		Player p7 = new Player("49ers", "D/ST", 13.00);
		Player p8 = new Player("Justin Tucker", "K", 10.00);
		
		playersList.addElement(new Player("Patrick Mahomes", "QB", 31.42));
		
//		playersList.addElement(p1.getName() + ", " + p1.getPosition() + ", " + p1.getPoints());
//		playersList.addElement(p2.getName() + ", " + p2.getPosition() + ", " + p2.getPoints());
//		playersList.addElement(p3.getName() + ", " + p3.getPosition() + ", " + p3.getPoints());
//		playersList.addElement(p4.getName() + ", " + p4.getPosition() + ", " + p4.getPoints());
//		playersList.addElement(p5.getName() + ", " + p5.getPosition() + ", " + p5.getPoints());
//		playersList.addElement(p6.getName() + ", " + p6.getPosition() + ", " + p6.getPoints());
//		playersList.addElement(p7.getName() + ", " + p7.getPosition() + ", " + p7.getPoints());
//		playersList.addElement(p8.getName() + ", " + p8.getPosition() + ", " + p8.getPoints());
		
	}
	
	
	
	
	
	
	
	
}
