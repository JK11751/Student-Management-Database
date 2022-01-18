import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PrintRecord {

    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        final JTextArea panel = new JTextArea();
        JLabel label = new JLabel();
        final JLabel reference = new JLabel();
        JLabel coursecode = new JLabel();
        JLabel coursetitle = new JLabel();
        JLabel studentId = new JLabel();
        JLabel studentName = new JLabel();
        JLabel dob = new JLabel();
        JLabel address = new JLabel();
        JLabel tel = new JLabel();
        JButton addrecord = new JButton();
        JButton print = new JButton();
        JButton reset = new JButton();
        JButton exit = new JButton();
        final JTextField refer = new JTextField();
        final JTextField code = new JTextField();
        final JTextField title = new JTextField();
        final JTextField id = new JTextField();
        final JTextField name = new JTextField();
        final JTextField date = new JTextField();
        final JTextField addr = new JTextField();
        final JTextField telephone = new JTextField();

        panel.setBounds(520, 80, 570, 390);
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
        panel.setFont(new Font("Monospaced", Font.BOLD, 10));
        panel.setBorder(new LineBorder(Color.black, 2));

        label.setText("Print Student Record System in Java Eclipse");
        label.setFont(new Font("Tahoma", Font.BOLD, 30));
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(120, 10, 970, 60);
        label.setBorder(new LineBorder(Color.black, 4));
        label.setBackground(Color.GRAY);
        label.setOpaque(true);

        reference.setText("Reference No");
        reference.setFont(new Font("Tahoma", Font.BOLD, 20));
        reference.setVerticalAlignment(JLabel.CENTER);
        reference.setHorizontalAlignment(JLabel.LEFT);
        reference.setBounds(120, 70, 150, 50);

        refer.setBounds(290, 80, 200, 40);
        refer.setFont(new Font("Tahoma", Font.BOLD, 20));
        refer.setBorder(new LineBorder(Color.black, 2));

        coursecode.setText("Course Code");
        coursecode.setFont(new Font("Tahoma", Font.BOLD, 20));
        coursecode.setVerticalAlignment(JLabel.CENTER);
        coursecode.setHorizontalAlignment(JLabel.LEFT);
        coursecode.setBounds(120, 120, 150, 50);

        code.setBounds(290, 130, 200, 40);
        code.setFont(new Font("Tahoma", Font.BOLD, 20));
        code.setBorder(new LineBorder(Color.black, 2));

        coursetitle.setText("Course Title");
        coursetitle.setFont(new Font("Tahoma", Font.BOLD, 20));
        coursetitle.setVerticalAlignment(JLabel.CENTER);
        coursetitle.setHorizontalAlignment(JLabel.LEFT);
        coursetitle.setBounds(120, 170, 150, 50);

        title.setBounds(290, 180, 200, 40);
        title.setFont(new Font("Tahoma", Font.BOLD, 20));
        title.setBorder(new LineBorder(Color.black, 2));

        studentId.setText("Student ID");
        studentId.setFont(new Font("Tahoma", Font.BOLD, 20));
        studentId.setVerticalAlignment(JLabel.CENTER);
        studentId.setHorizontalAlignment(JLabel.LEFT);
        studentId.setBounds(120, 220, 150, 50);

        id.setBounds(290, 230, 200, 40);
        id.setFont(new Font("Tahoma", Font.BOLD, 20));
        id.setBorder(new LineBorder(Color.black, 2));

        studentName.setText("Student Name");
        studentName.setFont(new Font("Tahoma", Font.BOLD, 20));
        studentName.setVerticalAlignment(JLabel.CENTER);
        studentName.setHorizontalAlignment(JLabel.LEFT);
        studentName.setBounds(120, 270, 150, 50);

        name.setBounds(290, 280, 200, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 20));
        name.setBorder(new LineBorder(Color.black, 2));

        dob.setText("Date Of Birth");
        dob.setFont(new Font("Tahoma", Font.BOLD, 20));
        dob.setVerticalAlignment(JLabel.CENTER);
        dob.setHorizontalAlignment(JLabel.LEFT);
        dob.setBounds(120, 320, 150, 50);

        date.setBounds(290, 330, 200, 40);
        date.setFont(new Font("Tahoma", Font.BOLD, 20));
        date.setBorder(new LineBorder(Color.black, 2));

        address.setText("Address");
        address.setFont(new Font("Tahoma", Font.BOLD, 20));
        address.setVerticalAlignment(JLabel.CENTER);
        address.setHorizontalAlignment(JLabel.LEFT);
        address.setBounds(120, 370, 150, 50);

        addr.setBounds(290, 380, 200, 40);
        addr.setFont(new Font("Tahoma", Font.BOLD, 20));
        addr.setBorder(new LineBorder(Color.black, 2));

        tel.setText("Telephone No");
        tel.setFont(new Font("Tahoma", Font.BOLD, 20));
        tel.setVerticalAlignment(JLabel.CENTER);
        tel.setHorizontalAlignment(JLabel.LEFT);
        tel.setBounds(120, 420, 150, 50);

        telephone.setBounds(290, 430, 200, 40);
        telephone.setFont(new Font("Tahoma", Font.BOLD, 20));
        telephone.setBorder(new LineBorder(Color.black, 2));

        addrecord.setBounds(120, 480, 170, 50);
        addrecord.setFont(new Font("Tahoma", Font.BOLD, 20));
        addrecord.setText("Add Record");
        addrecord.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                panel.append("\t\t Student Record \n\n" + "Reference No: \t\t\t" + reference.getText() +
                        "\n=====================================================================================\n" +
                        "Course Code:\t\t\t" + code.getText() + "\n\n" +
                        "Course Title:\t\t\t" + title.getText() + "\n\n" +
                        "Student ID:\t\t\t" + id.getText() + "\n\n" +
                        "Student Name:\t\t\t" + name.getText() + "\n\n" +
                        "Date of Birth:\t\t\t" + date.getText() + "\n\n" +
                        "Address:\t\t\t" + addr.getText() + "\n\n" +
                        "Telephone:\t\t\t" + telephone.getText() + "\n\n" +
                        "=============================================================================================="

                );
            }

        });

        print.setBounds(380, 480, 170, 50);
        print.setFont(new Font("Tahoma", Font.BOLD, 20));
        print.setText("Print");
        print.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
                    panel.print();
                } catch (PrinterException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }

            }

        });

        reset.setBounds(650, 480, 170, 50);
        reset.setFont(new Font("Tahoma", Font.BOLD, 20));
        reset.setText("Reset");
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                refer.setText(null);
                code.setText(null);
                name.setText(null);
                id.setText(null);
                addr.setText(null);
                title.setText(null);
                date.setText(null);
                telephone.setText(null);
                panel.setText(null);

            }

        });

        exit.setBounds(920, 480, 170, 50);
        exit.setFont(new Font("Tahoma", Font.BOLD, 20));
        exit.setText("Exit");
        exit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit!", "The System",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

                    System.exit(0);
                }
            }

        });

        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(1200, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(label);
        frame.add(reference);
        frame.add(coursecode);
        frame.add(coursetitle);
        frame.add(studentId);
        frame.add(studentName);
        frame.add(dob);
        frame.add(address);
        frame.add(tel);
        frame.add(addrecord);
        frame.add(exit);
        frame.add(print);
        frame.add(reset);
        frame.add(refer);
        frame.add(code);
        frame.add(addr);
        frame.add(telephone);
        frame.add(date);
        frame.add(id);
        frame.add(title);
        frame.add(name);
        frame.add(panel);

    }

}
