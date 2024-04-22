package service;

// ======================================== Core Library
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.border.Border;

public class Interface extends JFrame {

    private JTextPane asciiTextPane;
    private JPanel buttonPanel;

    public Interface() {
        setTitle("Team Bro Code");
        setSize(1200, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        asciiTextPane = new JTextPane();
        asciiTextPane.setContentType("text/html");
        asciiTextPane.setEditable(false);
        asciiTextPane.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 50));
        asciiTextPane.setForeground(Color.WHITE);

        JScrollPane scrollPane = new JScrollPane(asciiTextPane);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        add(scrollPane, BorderLayout.CENTER);

        Border roundedBorder = BorderFactory.createLineBorder(Color.WHITE, 0, true);

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 28));
        signUpButton.setBackground(Color.WHITE);
        signUpButton.setForeground(Color.RED);
        signUpButton.setBorder(roundedBorder);
        signUpButton.setPreferredSize(new Dimension(200, 60));
        signUpButton.setMargin(new Insets(10, 20, 10, 20));

        JButton loginButton = new JButton("Log In");
        loginButton.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 28));
        loginButton.setBackground(Color.GREEN);
        loginButton.setForeground(Color.RED);
        loginButton.setBorder(roundedBorder);
        loginButton.setPreferredSize(new Dimension(200, 60));
        loginButton.setMargin(new Insets(10, 20, 10, 20));

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        buttonPanel.setBackground(Color.RED);
        buttonPanel.setOpaque(false);
        buttonPanel.add(signUpButton);
        buttonPanel.add(loginButton);

        add(buttonPanel, BorderLayout.SOUTH);

        String htmlContent = "<html>"
                + "<div style='font-size:100px;text-align:center;'>Welcome To</div><br>"
                + "<div style='font-size:80px;text-align:center;color:purple;'>Task-management-system</div>"
                + "<br>"
                + "<br>"
                + "<br>"
                + "<div style='text-align:center;'><img src='https://images.ctfassets.net/rz1oowkt5gyp/1IgVe0tV9yDjWtp68dAZJq/36ca564d33306d407dabe39c33322dd9/TaskManagement-hero.png' width='600' height='400' alt='Placeholder Image'></div>"
                + "</html>";
        updateAsciiArt(htmlContent);

        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAsciiArt(
                        "<html><div style='font-size:50px;text-align:center;color:purple;'>Complete Your Form Below</div></html>");
                buttonPanel.setVisible(false);
            }
        });

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAsciiArt(
                        "<html><div style='font-size:100px;text-align:center;color:green;'>Your Sing in is Success</div></html>");
                buttonPanel.setVisible(false);
            }
        });

        setVisible(true);
    }

    private void updateAsciiArt(String htmlText) {
        asciiTextPane.setText(htmlText);
    }

}
