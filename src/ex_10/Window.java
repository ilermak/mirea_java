package ex_10;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Window extends JFrame {

    static class ImagePanel extends JComponent {
        private Image image;
        public ImagePanel(Image image) {
            this.image = image;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }



    private JTextField textField1;
    private JTextField textField2;
    private JLabel label;
    private JLabel label2;
    private JTextField result;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;


    public Window() {
        try {
            BufferedImage myImage = ImageIO.read(new File("C:\\Users\\Iluuusha\\Desktop\\учеба\\mirea_java\\src\\ex_10\\bionic.jpg"));
            setContentPane(new ImagePanel(myImage));
        } catch (IOException e) {
            e.printStackTrace();
        }


        setTitle("Calculator");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        addFields();
        setResizable(false);


        setListener(button3, '+');
        setListener(button4, '-');
        setListener(button5, '*');
        setListener(button6, ':');


    }

    private void setListener(JButton btn, char smb) {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double temp=0, temp2 = 0;
                try {
                    temp = Double.parseDouble(textField1.getText());
                    temp2 = Double.parseDouble(textField2.getText());
                } catch (Exception e1) {
                    JOptionPane.showMessageDialog(null, "Вы ввели неверные значения.");
                    return;
                }
                result.setText(calc(temp, temp2, smb));
            }
        });
    }


    private String calc(double a, double b, char c) {
        double result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;
            case ':':
                try {
                    result = a / b;
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Деление на ноль");
                    result = 0;
                    break;
                }

        }

        return String.format("%.4f", result);
    }

    private void addFields() {
        textField1 = new JTextField();
        textField2 = new JTextField();
        label = new JLabel("Number 1");
        label2 = new JLabel("Number 2");
        result = new JTextField();
        button3 = new JButton("+");
        button4 = new JButton("-");
        button5 = new JButton("*");
        button6 = new JButton(":");
        int x=50,y=10;

        label.setBounds(x+10, y+10, 50, 25);
        label.setForeground(Color.WHITE);

        textField1.setBounds(x+60, y+10, 100, 25);

        label2.setBounds(x+170, y+10, 50, 25);
        label2.setForeground(Color.WHITE);
        textField2.setBounds(x+220, y+10, 100, 25);
        add(label);
        add(textField1);
        add(label2);
        add(textField2);
        button3.setBounds(x+60, y+90, 45, 45);
        button4.setBounds(x+315, y+100, 45, 45);
        button5.setBounds(x+20, y+180, 45, 45);
        button6.setBounds(x+295, y+200, 45, 45);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        result.setBounds(x+100, y+420, 150, 25);
        add(result);
    }
}
