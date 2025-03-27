package gr.aueb.cf.schoolapp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField username;
	private JPasswordField password;

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/images/eduv2.png")));
		setFont(new Font("Carlito", Font.PLAIN, 14));
		setForeground(Color.BLACK);
		setTitle("Αυθεντικοποίηση Χρήστη");
		setBackground(new Color(238, 238, 238));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 450, 350);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblLogin = new JLabel("Σύνδεση");
		lblLogin.setFont(new Font("Carlito", Font.BOLD, 17));
		lblLogin.setBounds(189, 23, 72, 22);
		panel.add(lblLogin);
		
		JLabel lblInsertPass = new JLabel("Παρακαλώ εισάγετε τους κωδικούς σας για να συνδεθείτε");
		lblInsertPass.setBounds(24, 46, 403, 29);
		panel.add(lblInsertPass);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(30, 144, 255));
		separator.setBounds(24, 73, 403, 2);
		panel.add(separator);
		
		JLabel lblUser = new JLabel("Χρήστης:");
		lblUser.setBounds(79, 114, 70, 15);
		panel.add(lblUser);
		
		JLabel lblPassword = new JLabel("Κωδικός:");
		lblPassword.setBounds(79, 182, 70, 15);
		panel.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(76, 141, 307, 29);
		panel.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(76, 209, 307, 29);
		panel.add(password);
		
		JButton btnLogin = new JButton("Σύνδεση");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((username.getText().matches("[aA]dmin")) && (Arrays.equals(password.getPassword(), "12345".toCharArray()))) {
					Main.getLoginpage().setVisible(false);
					Main.getDashboard().setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Λάθος username ή password", "Αδυναμία Σύνδεσης", JOptionPane.ERROR_MESSAGE);
					username.setText("");
					password.setText("");
				}
			}
		});
		btnLogin.setBackground(new Color(0, 128, 0));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBounds(79, 270, 304, 48);
		panel.add(btnLogin);
	}
}
