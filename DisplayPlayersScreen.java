import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

/**
 * 
 * 
 * This class creates the screen that displays the list of players and will potentially house the rest of the screens
 *
 */
public class DisplayPlayersScreen extends JFrame {

	private JPanel contentPane;
	private JList listTeam2;
	private JList listTeam1;
	private double tmTtlPoints1;
	private double tmTtlPoints2;
	private JList listTeamWinner;
	Team team1 = new Team("Team 2");
	
	// Pulling these variable from the mainFrame class
	static Team team2 = null;
	static String username = null;
	
	DefaultListModel teamList1 = new DefaultListModel();
	DefaultListModel teamList2 = new DefaultListModel();
	DefaultListModel<String> winner = new DefaultListModel<String>();

	/**
	 * Create the frame.
	 */
	public DisplayPlayersScreen() {
		setTitle("Vanguard Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 668, 609);
		setIconImage(Toolkit.getDefaultToolkit().getImage(StartScreen.class.getResource("/images/VanguardLogoSmaller.png")));
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Creating the tabs
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.DARK_GRAY);
		tabbedPane.setBounds(10, 30, 632, 436);
		contentPane.add(tabbedPane);
		
		JPanel PlayerListPanel = new JPanel();
		tabbedPane.addTab("Player List", null, PlayerListPanel, null);
		tabbedPane.setBackgroundAt(0, Color.RED);
		PlayerListPanel.setLayout(null);
		
		String[][] data = {{"Tony Pollard", "RB", "Cowboys"},
							{"Gus Edwards", "RB", "Ravens"},
							{"Nelson Agholor", "WR", "Patriots"},
							{"Hunter Henry", "TE", "Patriots"},
							{"Cole Beasley", "WR", "Bills"},
							{"Marquez Valdes-Scantling", "WR", "Chiefs"},
							{"Jonathan Taylor", "RB", "Colts"},
							{"Chase Edmonds", "RB", "Dolphins"},
							{"Robert Woods", "WR", "Titans"},
							{"Cooper Kupp", "WR", "Rams"},
							{"Trey Sermon", "RB", "49ers"},
							{"Mike Gesicki", "TE", "Dolphins"},
							{"Evan Engram", "TE", "Jaguars"},
							{"Antonio Gibson", "RB", "Commanders"}};
		
		// Creating the list object
		JList<String> list = new JList<String>();
		list.setBounds(10, 11, 622, 198);
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		
		for(String[] item : data) {
			dlm.addElement(item[0] + "  (" + item[1] + ")  [" + item[2] + "]");
		}
		
		list.setModel(dlm);
		
		JScrollPane j = new JScrollPane(list);
		j.setBounds(10, 11, 607, 202);
		PlayerListPanel.add(j);
		
		// Creating the button
		JButton btnAddPlayer = new JButton("Add Player to Team");
		btnAddPlayer.setBackground(Color.RED);
		btnAddPlayer.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnAddPlayer.setBounds(237, 285, 177, 44);
		PlayerListPanel.add(btnAddPlayer);
		
		
		
		JPanel head2HeadPanel = new JPanel();
		tabbedPane.addTab("Head2Head", null, head2HeadPanel, null);
		head2HeadPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 607, 386);
		panel.setBorder(new TitledBorder(null, "Week 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		head2HeadPanel.add(panel);
		
		JScrollPane scpTeam1 = new JScrollPane();
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton btnReveal = new JButton("Reveal");
		btnReveal.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnReveal.setBackground(Color.RED);
		btnReveal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tmTtlPoints1 = 0;
				tmTtlPoints2 = 0;
				
				for (int i = 0; i < team1.getTeamSize(); i++) {
					tmTtlPoints1 += team1.getPlayer(i).getPoints();
				}
				
				for (int i = 0; i < team2.getTeamSize(); i++) {
					tmTtlPoints2 += team2.getPlayer(i).getPoints();
				}
				
				if (tmTtlPoints1 > tmTtlPoints2) {
					winner.clear();
					winner.addElement(team1.getName());
					winner.addElement("With a total of " + tmTtlPoints1 + "!!");
				} else {
					winner.clear();
					winner.addElement("");
					winner.addElement("");
					winner.addElement("");
					winner.addElement("----------------------------");
					winner.addElement("      " + team2.getName());
					winner.addElement("             " + tmTtlPoints2);
					winner.addElement("                 !!");
				}
				
				
				
			}
		});
		
		JLabel lblTeam1 = new JLabel(username);
		lblTeam1.setFont(new Font("Dialog", Font.BOLD, 13));
		
		JLabel lblNewLabel = new JLabel(team2.getName());
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		JLabel lblTeam2 = new JLabel("Username");
		lblTeam2.setFont(new Font("Dialog", Font.BOLD, 13));
		
		JScrollPane scpTeam2 = new JScrollPane();
		
		JLabel lblNewLabel_1 = new JLabel("Team2");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(scpTeam1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnReveal, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)))
						.addComponent(lblTeam1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTeam2)
						.addComponent(lblNewLabel_1)
						.addComponent(scpTeam2, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblTeam2))
						.addComponent(lblTeam1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scpTeam1, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
							.addComponent(scpTeam2, Alignment.LEADING)
							.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
								.addGap(136)
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnReveal))))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		tabbedPane.setBackgroundAt(1, Color.RED);
		
		JLabel lblTitleLabel = new JLabel("VANGUARD");
		lblTitleLabel.setForeground(Color.WHITE);
		lblTitleLabel.setFont(new Font("Arial Black", Font.PLAIN, 49));
		lblTitleLabel.setBounds(158, 478, 338, 70);
		contentPane.add(lblTitleLabel);
		
		JTextArea txtrWinner = new JTextArea();
		txtrWinner.setText("              Winner");
		scrollPane.setColumnHeaderView(txtrWinner);
		
		listTeamWinner = new JList(winner);
		
		scrollPane.setViewportView(listTeamWinner);
		
		
		listTeam2 = new JList(teamList2);
		
		listTeam1 = new JList(teamList1);
		
		
		
		initTeamList1();
		initTeamList2();
		
		scpTeam2.setViewportView(listTeam2);
		
		scpTeam1.setViewportView(listTeam1);
		panel.setLayout(gl_panel);
	}
	
	// Init Methods
private void initTeamList2() {
		
		initTeam2();
		for(int i = 0; i < team2.getTeamSize(); i++) {
			teamList2.addElement("");
			teamList2.addElement( team2.getPlayer(i) );
		}
	}

	private void initTeamList1() {
		
		initTeam1();
		for(int i = 0; i < team1.getTeamSize(); i++) {
			teamList1.addElement("");
			teamList1.addElement(team1.getPlayer(i));
		}
	}

	private void initTeam2() {
		
		team2.setTeamSizeCap(11);
		team2.addPlayer(new Player("Patrick Mahomes", "QB", 31.42));
		team2.addPlayer(new Player("Nick Chubb", "RB1", 12.44));
		team2.addPlayer(new Player("Josh Jacobs", "RB2", 15.75));
		team2.addPlayer(new Player("Justin Jefferson", "WR1", 9.10));
		team2.addPlayer(new Player("AJ Brown", "WR2", 13.10));
		team2.addPlayer(new Player("Travis Kelce", "TE", 13.70));
		team2.addPlayer(new Player("Tyreek Hill", "FLEX", 25.67));
		team2.addPlayer(new Player("49ers", "D/ST", 13.00));
		team2.addPlayer(new Player("Justin Tucker", "K", 10.00));
		
	}

	private void initTeam1() {
		
		team1.addPlayer(new Player("Lamar Jackson", "QB", 16.52));
		team1.addPlayer(new Player("Derrick Henry", "RB1", 9.79));
		team1.addPlayer(new Player("Alvin Kamara", "RB2", 18.00));
		team1.addPlayer(new Player("Davante Adams", "WR1", 16.90));
		team1.addPlayer(new Player("Stefon Diggs", "WR2", 24.40));
		team1.addPlayer(new Player("George Kittle", "TE", 12.00));
		team1.addPlayer(new Player("Calvin Ridley", "FLEX", 6.60));
		team1.addPlayer(new Player("Rams", "D/ST", 5.00));
		team1.addPlayer(new Player("Rodrigo Blakenship", "K", 6.00));
		
	}
}
