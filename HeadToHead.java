import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class HeadToHead extends JFrame {

	private JPanel contentPane;
	
	League league;
	Team team1 = new Team("Red Pythons");
	Team team2 = new Team("Java Warriors");
	DefaultListModel teamList1 = new DefaultListModel();
	DefaultListModel teamList2 = new DefaultListModel();
	DefaultListModel<String> winner = new DefaultListModel<String>();
	
	private JButton btnReveal;
	private JLabel lblTeam1;
	private JLabel lblTeam2;
	private JScrollPane scpTeam1;
	private JScrollPane scpTeam2;
	private JList listTeam2;
	private JList listTeam1;
	private JList listTeamWinner;
	private double tmTtlPoints1;
	private double tmTtlPoints2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeadToHead frame = new HeadToHead();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HeadToHead() {
		
		initComponents();
		createEvents();
	}

	private void createEvents() {
		// TODO Auto-generated method stub
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
					winner.addElement(team1.getName());
					winner.addElement("With a total of " + tmTtlPoints1 + "!!");
				} else {
					winner.addElement("");
					winner.addElement("");
					winner.addElement("");
					winner.addElement("-----------------");
					winner.addElement("      " + team2.getName());
					winner.addElement("          " + tmTtlPoints2);
					winner.addElement("              !!");
				}
				
				
				
			}
		});
		
	}

	private void initComponents() {
		// TODO Auto-generated method stub
		
		setTitle("Vanguard App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblHeader = new JLabel("Vanguard Fantasy Football");
		lblHeader.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Week 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 607, 386);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(30, Short.MAX_VALUE)
					.addComponent(lblHeader, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
					.addGap(174))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblHeader, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(96, Short.MAX_VALUE))
		);
		
		scpTeam1 = new JScrollPane();
		
		scpTeam2 = new JScrollPane();
		
		lblTeam1 = new JLabel("Username");
		lblTeam1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		
		btnReveal = new JButton("Reveal");
		btnReveal.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnReveal.setBackground(Color.RED);

		
		lblTeam2 = new JLabel("Username");
		lblTeam2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		
		JLabel lblNewLabel = new JLabel("Team1");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("Team2");
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(scpTeam1, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
									.addComponent(btnReveal, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
								.addGap(18))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblTeam1)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(286)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTeam2)
						.addComponent(scpTeam2, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(74, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblTeam2)
						.addComponent(lblTeam1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(scpTeam1, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE)
						.addComponent(scpTeam2, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
					.addGap(26))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(232)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnReveal)
					.addContainerGap(96, Short.MAX_VALUE))
		);
		
		JTextArea txtrWinner = new JTextArea();
		txtrWinner.setText("          Winner");
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
		contentPane.setLayout(gl_contentPane);

	}

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
