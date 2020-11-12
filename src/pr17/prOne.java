package pr17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class prOne extends JFrame
{
    JTextField jta1 = new JTextField(20);
    JTextField jta2 = new JTextField(20);
    JTextField jta3 = new JTextField(20);
    JButton button1 = new JButton("          Результат игры          ");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    private int sum;


    prOne()
    {

        super("Игра решить все уравнения");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("2*(5+5)+28/7+25*(6/3)               "));
        add(jta1);
        add(new JLabel("5*(4+3)+49/7+25*(9/3)               "));
        add(jta2);
        add(new JLabel("4*(9+9)+56/7+23*(12/3)               "));
        add(jta3);
        add(button1);
        int x1=2*(5+5)+28/7+25*(6/3);
        int x2=5*(4+3)+49/7+25*(9/3);
        int x3=4*(9+9)+56/7+23*(12/3);
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        Dimension dimension =toolkit.getScreenSize();
        setBounds(dimension.width/2-250,dimension.height/2-150,400,300);
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    double x4 = Double.parseDouble(jta1.getText().trim());
                    double x5 = Double.parseDouble(jta2.getText().trim());
                    double x6 = Double.parseDouble(jta3.getText().trim());
                    sum=0;
                    if(x4==x1)sum++;
                    if(x5==x2)sum++;
                    if(x6==x3)sum++;
                    if(sum==0)
                    {
                        JOptionPane.showMessageDialog(null, "0/3", "Ещё", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(sum==1)
                    {
                        JOptionPane.showMessageDialog(null, "1/3", "Ещё", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if(sum==2)
                    {
                        JOptionPane.showMessageDialog(null,"2/3", "Ещё", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    if (sum==3) {
                        JOptionPane.showMessageDialog(null, "Вы победитель", "Победа!", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                } catch (Exception e) {}
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new prOne();
    }
}

