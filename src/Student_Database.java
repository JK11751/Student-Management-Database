import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Student_Database {

	private JFrame frame;
	private JTextField textAdmissionNo;
	private JTextField textFirstName;
	private JTextField textSurname;
	private JTextField textClass;
	private JTable table;
	private JTextField textSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_Database window = new Student_Database();
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
	public Student_Database() {
		initialize();
	}
	Connection con;
	PreparedStatement pst;
	
	public void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("");
		}
		catch(ClassNotFoundException ex)
		{
			
		}
		catch(SQLException ex)
		{
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 745, 464);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Record");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(132, 11, 246, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 74, 337, 211);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Admission No:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(10, 24, 152, 23);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 64, 152, 23);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Surname");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(10, 110, 152, 23);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Class");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(10, 154, 152, 23);
		panel.add(lblNewLabel_1_3);
		
		textAdmissionNo = new JTextField();
		textAdmissionNo.setBounds(187, 24, 127, 20);
		panel.add(textAdmissionNo);
		textAdmissionNo.setColumns(10);
		
		textFirstName = new JTextField();
		textFirstName.setColumns(10);
		textFirstName.setBounds(187, 69, 127, 20);
		panel.add(textFirstName);
		
		textSurname = new JTextField();
		textSurname.setColumns(10);
		textSurname.setBounds(187, 115, 127, 20);
		panel.add(textSurname);
		
		textClass = new JTextField();
		textClass.setColumns(10);
		textClass.setBounds(187, 159, 127, 20);
		panel.add(textClass);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFocusable(false);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setBounds(10, 296, 92, 37);
		frame.getContentPane().add(btnSave);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(130, 296, 92, 37);
		btnExit.setFocusable(false);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(266, 296, 81, 37);
		btnReset.setFocusable(false);
		frame.getContentPane().add(btnReset);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(372, 82, 347, 251);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 356, 337, 58);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Admission No:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 18, 161, 29);
		panel_1.add(lblNewLabel_2);
		
		textSearch = new JTextField();
		textSearch.setBounds(181, 18, 146, 29);
		panel_1.add(textSearch);
		textSearch.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(392, 356, 89, 43);
		btnUpdate.setFocusable(false);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFocusable(false);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBounds(539, 356, 89, 43);
		frame.getContentPane().add(btnDelete);
	}
}
