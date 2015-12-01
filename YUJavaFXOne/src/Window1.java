import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window1 {

	private JFrame frame;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window1 window = new Window1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMyNameIs = new JLabel("My name is:");
		lblMyNameIs.setBounds(52, 16, 67, 46);
		lblMyNameIs.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(lblMyNameIs);
		
		textField = new JTextField();
		textField.setBounds(160, 25, 222, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIAm = new JLabel("I am:");
		lblIAm.setBounds(52, 54, 27, 46);
		lblIAm.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().add(lblIAm);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 74, 222, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIAmA = new JLabel("I am a student of Year Up!");
		lblIAmA.setBounds(16, 140, 418, 46);
		lblIAmA.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblIAmA.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblIAmA);
		
		JButton btnWhoAreYou = new JButton("Who are you?");
		btnWhoAreYou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnWhoAreYou.getText() != null)
				{
					if (btnWhoAreYou.getText().equals("Who are you?"))
					{
						textField.setText("Reginald Smith");
						textField_1.setText("21");
						btnWhoAreYou.setText("Clear Me!");
					}
					else
					{
						textField.setText("");
						textField_1.setText("");
						btnWhoAreYou.setText("Who are you?");
					}
				}
			}
		});
		btnWhoAreYou.setBounds(16, 216, 418, 36);
		btnWhoAreYou.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		frame.getContentPane().add(btnWhoAreYou);
	}

}
