package vic.dash.com;

import javax.swing.*;
import java.awt.*;

public class Main {

    static JButton teacher = new JButton("Teacher");
    static JButton student = new JButton("Student");
    static JButton examOfficer = new JButton("Exam Officer");

    static JTextField welcomeText = new JTextField("Welcome to the main dashboard");

    public static void main(String[] args) {

        String hexPanel = "#FFF7F8";
        String panelBorder = "#91a0c7";

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.decode(hexPanel));
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.decode(panelBorder), 5));

        frame.setContentPane(panel);

        panel.add(welcomeText);

        panel.add(teacher);
        panel.add(student);
        panel.add(examOfficer);



        welcomeText.setBounds(150,50,500,40);
        welcomeText.setFocusable(false);
        welcomeText.setBorder(BorderFactory.createEmptyBorder());
        welcomeText.setBackground(new Color(0, 0, 0, 0));
        welcomeText.setFont(new Font("Arial", Font.BOLD, 20));

        teacher.setBounds(150,150,200,40);
        teacher.setFocusable(true);
        teacher.setFocusPainted(false);
        teacher.setBackground(Color.PINK);
        teacher.addActionListener(e -> {

            String staffId = JOptionPane.showInputDialog("Enter your staff ID :");

            if (staffId != null) {
                JOptionPane.showMessageDialog(null, "Your staff ID is " + staffId);
            } else {
                JOptionPane.showMessageDialog(null, "Operation cancelled by user");
            }

        });

        student.setBounds(150,250,200,40);
        student.setFocusable(true);
        student.setFocusPainted(false);
        student.setBackground(Color.PINK);
        student.addActionListener(e -> {

            String admNumber = JOptionPane.showInputDialog("Enter your admission number :");

            if (admNumber != null) {
                JOptionPane.showMessageDialog(null, "Your admission number is " + admNumber);
            } else {
                JOptionPane.showMessageDialog(null, "Operation cancelled by user");
            }

        });

        examOfficer.setBounds(150,350,245,40);
        examOfficer.setFocusable(true);
        examOfficer.setFocusPainted(false);
        examOfficer.setBackground(Color.PINK);
        examOfficer.addActionListener(e -> {

            String examinerId = JOptionPane.showInputDialog("Enter your examiner ID :");

            if (examinerId != null) {
                JOptionPane.showMessageDialog(null, "Your examiner ID is " + examinerId);
            } else {
                JOptionPane.showMessageDialog(null, "Operation cancelled by user");
            }

        });
    }
}