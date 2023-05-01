import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 * 
 * @author Kamir Walton
 * 
 * This class creates the screen that displays the list of players and will potentially house the rest of the screens
 *
 */
public class DisplayPlayersScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public DisplayPlayersScreen() {
		setTitle("Vanguard Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 593);
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
		tabbedPane.setBounds(0, 30, 493, 433);
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
		list.setBounds(10, 11, 468, 198);
		DefaultListModel<String> dlm = new DefaultListModel<String>();
		
		for(String[] item : data) {
			dlm.addElement(item[0] + "  (" + item[1] + ")  [" + item[2] + "]");
		}
		
		list.setModel(dlm);
		
		JScrollPane j = new JScrollPane(list);
		j.setBounds(10, 11, 468, 198);
		PlayerListPanel.add(j);
		
		// Creating the button
		JButton btnAddPlayer = new JButton("Add Player to Team");
		btnAddPlayer.setBackground(Color.RED);
		btnAddPlayer.setFont(new Font("Arial Black", Font.PLAIN, 13));
		btnAddPlayer.setBounds(155, 285, 177, 44);
		PlayerListPanel.add(btnAddPlayer);
		
		
		
		JPanel head2HeadPanel = new JPanel();
		tabbedPane.addTab("Head2Head", null, head2HeadPanel, null);
		tabbedPane.setBackgroundAt(1, Color.RED);
		
		JLabel lblTitleLabel = new JLabel("VANGUARD");
		lblTitleLabel.setForeground(Color.WHITE);
		lblTitleLabel.setFont(new Font("Arial Black", Font.PLAIN, 49));
		lblTitleLabel.setBounds(84, 473, 338, 70);
		contentPane.add(lblTitleLabel);;
	}
}
