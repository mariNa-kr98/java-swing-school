package gr.aueb.cf.schoolapp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JSeparator;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public LandingPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(LandingPage.class.getResource("/images/eduv2.png")));
		setTitle("Ποιότητα στην εκπαίδευση");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBackground(SystemColor.activeCaption);
		header.setBounds(0, 0, 778, 56);
		contentPane.add(header);
		header.setLayout(null);
		
		JLabel govimage = new JLabel("");
		govimage.setIcon(new ImageIcon(LandingPage.class.getResource("/images/gov_logo_small.png")));
		govimage.setBounds(0, 0, 154, 56);
		header.add(govimage);
		
		JLabel lblAuthRequired = new JLabel("Απαιτείται ταυτοποίηση");
		lblAuthRequired.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAuthRequired.setBounds(32, 70, 320, 45);
		contentPane.add(lblAuthRequired);
		
		JLabel lblMustConnect = new JLabel("Για να προχωρήσετε πρέπει να συνδεθείτε");
		lblMustConnect.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblMustConnect.setBounds(32, 123, 320, 45);
		contentPane.add(lblMustConnect);
		
		JButton btnConnect = new JButton("Σύνδεση");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.getLandingpage().setVisible(false);
				Main.getLoginpage().setVisible(true);
			}
		});
		btnConnect.setEnabled(false);
		btnConnect.setForeground(new Color(248, 248, 255));
		btnConnect.setBackground(new Color(0, 100, 0));
		btnConnect.setBounds(32, 234, 117, 47);
		contentPane.add(btnConnect);
		
		JCheckBox privacyCheckBox = new JCheckBox("Δηλώνω ότι αποδέχομαι τη δήλωση ιδιωτικότητας");
		privacyCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					btnConnect.setEnabled(true);
				} else {
					btnConnect.setEnabled(false);
				}
			}
		});
		privacyCheckBox.setFont(new Font("Dialog", Font.PLAIN, 12));
		privacyCheckBox.setBounds(32, 176, 209, 23);
		contentPane.add(privacyCheckBox);
		
		JLabel lblPrivacy = new JLabel("Δήλωση ιδιωτικότητας");
		lblPrivacy.setForeground(new Color(0, 0, 255));
		lblPrivacy.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblPrivacy.setBounds(255, 180, 172, 15);
		contentPane.add(lblPrivacy);
		
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 293, 547, 69);
		contentPane.add(footer);
		footer.setLayout(null);
		
		JLabel lblManual = new JLabel("Εγχειρίδιο Χρήσης");
		lblManual.setFont(new Font("Dialog", Font.BOLD, 10));
		lblManual.setForeground(new Color(22, 52, 222));
		lblManual.setBounds(29, 25, 106, 15);
		footer.add(lblManual);
		
		JLabel lblQuestions = new JLabel("Συχνές Ερωτήσεις");
		lblQuestions.setForeground(new Color(22, 52, 222));
		lblQuestions.setFont(new Font("Dialog", Font.BOLD, 10));
		lblQuestions.setBounds(147, 25, 106, 15);
		footer.add(lblQuestions);
		
		JLabel lblSupport = new JLabel("Υποστήριξη πολιτών");
		lblSupport.setForeground(new Color(22, 52, 222));
		lblSupport.setFont(new Font("Dialog", Font.BOLD, 10));
		lblSupport.setBounds(265, 25, 122, 15);
		footer.add(lblSupport);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(100, 149, 237));
		separator.setBounds(0, 2, 547, 1);
		footer.add(separator);
	}
}
