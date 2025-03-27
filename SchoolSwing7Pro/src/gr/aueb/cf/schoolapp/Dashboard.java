package gr.aueb.cf.schoolapp;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static Connection connection;

	/**
	 * Create the frame.
	 */
	public Dashboard() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				String sql = "jdbc:mysql://localhost:3306/school7dbpro?serverTimeZone=UTC";
				String username = "user7pro";
				String password = "12345";
				
				try {
					connection = DriverManager.getConnection(sql, username, password);
					System.out.println("Connection Success");
				}catch (SQLException el){
					el.printStackTrace();
				}
			}
		});
		setTitle("Ποιότητα στην εκπαίδευση");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setBackground(new Color(0, 0, 128));
		header.setBounds(0, 0, 631, 61);
		contentPane.add(header);
		
		JLabel govimage = new JLabel("");
		govimage.setIcon(new ImageIcon(Dashboard.class.getResource("/images/gov_logo_small.png")));
		govimage.setBounds(0, 0, 154, 56);
		header.add(govimage);
		
		JLabel lblNameTag = new JLabel("ΜΑΡΙΝΑ ΚΡΟΜΜΥΔΑ");
		lblNameTag.setForeground(new Color(255, 255, 255));
		lblNameTag.setFont(new Font("Cantarell", Font.BOLD, 13));
		lblNameTag.setBounds(476, 12, 143, 25);
		header.add(lblNameTag);
		
		JPanel footer = new JPanel();
		footer.setLayout(null);
		footer.setBounds(0, 355, 631, 69);
		contentPane.add(footer);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setForeground(new Color(22, 52, 222));
		lblManual.setFont(new Font("Dialog", Font.BOLD, 10));
		lblManual.setBounds(61, 25, 106, 15);
		footer.add(lblManual);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setForeground(new Color(22, 52, 222));
		lblQuestions.setFont(new Font("Dialog", Font.BOLD, 10));
		lblQuestions.setBounds(240, 25, 106, 15);
		footer.add(lblQuestions);
		
		JLabel lblSupport = new JLabel("Υποστήριξη πολιτών");
		lblSupport.setForeground(new Color(22, 52, 222));
		lblSupport.setFont(new Font("Dialog", Font.BOLD, 10));
		lblSupport.setBounds(425, 25, 122, 15);
		footer.add(lblSupport);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(100, 149, 237));
		separator.setBounds(0, 2, 547, 1);
		footer.add(separator);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 128));
		panel.setBounds(0, 59, 171, 294);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblInitialPage = new JLabel("Αρχική");
		lblInitialPage.setForeground(new Color(248, 228, 92));
		lblInitialPage.setBounds(12, 12, 70, 15);
		panel.add(lblInitialPage);
		
		JLabel lblPorfessors = new JLabel("Εκπαιδευτές");
		lblPorfessors.setForeground(new Color(255, 255, 255));
		lblPorfessors.setBounds(12, 39, 104, 15);
		panel.add(lblPorfessors);
		
		JLabel lblShowProf = new JLabel("Προβολή Εκπαιδευτών");
		lblShowProf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblShowProf.setText("<html><font color='blue'>Προβολή Εκπαιδευτών</font></html>");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblShowProf.setText("Προβολή Εκπαιδευτών");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.getDashboard().setEnabled(false);
				Main.getViewTeachersPage().setVisible(true);
			}
		});
		
		lblShowProf.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblShowProf.setForeground(new Color(255, 255, 255));
		lblShowProf.setBounds(22, 63, 137, 15);
		panel.add(lblShowProf);
		
		JLabel lblInsertProf = new JLabel("Εισαγωγή Εκπαιδευτή");
		lblInsertProf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblInsertProf.setText("<html><font color='blue'>Εισαγωγή Εκπαιδευτή</font></html>");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblInsertProf.setText("Εισαγωγή Εκπαιδευτή");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.getDashboard().setEnabled(false);
				Main.getInsertTeacherPage().setVisible(true);
			}
		});
		
		lblInsertProf.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblInsertProf.setForeground(new Color(255, 255, 255));
		lblInsertProf.setBounds(22, 83, 137, 15);
		panel.add(lblInsertProf);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 3, 171, 2);
		panel.add(separator_1);
		separator_1.setForeground(new Color(255, 255, 255));
		
		JLabel lblQualityEdu = new JLabel("Ποιότητα στην Εκπαίδευση");
		lblQualityEdu.setFont(new Font("Cantarell", Font.BOLD, 18));
		lblQualityEdu.setBounds(255, 73, 258, 49);
		contentPane.add(lblQualityEdu);
		
		JLabel lbl1stTitle = new JLabel("Προβολή Μητρώου Εκπαιδευτών");
		lbl1stTitle.setFont(new Font("Carlito", Font.BOLD, 14));
		lbl1stTitle.setBounds(189, 123, 198, 15);
		contentPane.add(lbl1stTitle);
		
		JLabel lbl1stTitleChild = new JLabel("Προβολή Μητρώου Εγγεγραμμένων Εκπαιδευτών στο Μητρώο του Coding Factory");
		lbl1stTitleChild.setFont(new Font("Carlito", Font.PLAIN, 12));
		lbl1stTitleChild.setBounds(189, 147, 402, 15);
		contentPane.add(lbl1stTitleChild);
		
		JButton btnContinue = new JButton("Συνέχεια");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getDashboard().setEnabled(false);
				Main.getViewTeachersPage().setVisible(true);
			}
		});
		btnContinue.setBackground(new Color(0, 128, 0));
		btnContinue.setForeground(new Color(255, 255, 255));
		btnContinue.setBounds(183, 174, 117, 37);
		contentPane.add(btnContinue);
		
		JLabel lbl2stTitle = new JLabel("Εισαγωγή Εκπαιδευτή στο Μητρώο Εκπαιδευτών");
		lbl2stTitle.setFont(new Font("Carlito", Font.BOLD, 14));
		lbl2stTitle.setBounds(189, 223, 324, 15);
		contentPane.add(lbl2stTitle);
		
		JLabel lbl2stTitleChild = new JLabel("Εισαγωγή Εκπαιδευτή στο Μητρώο του Coding Factory");
		lbl2stTitleChild.setFont(new Font("Carlito", Font.PLAIN, 12));
		lbl2stTitleChild.setBounds(189, 247, 402, 15);
		contentPane.add(lbl2stTitleChild);
		
		JButton btnContinue_1 = new JButton("Συνέχεια");
		btnContinue_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getDashboard().setEnabled(false);
				Main.getInsertTeacherPage().setVisible(true);	
			}
		});
		btnContinue_1.setForeground(Color.WHITE);
		btnContinue_1.setBackground(new Color(0, 128, 0));
		btnContinue_1.setBounds(183, 274, 117, 37);
		contentPane.add(btnContinue_1);
		
		
		}
	public static Connection getConnection() {
		return connection;
	}
}
