package com.practise.GUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Simple1 {

    JTextField jTextField;
    JButton jButton;
    void intGUI()
    {
        JFrame jFrame = new JFrame();
        Container c = jFrame.getContentPane();
        c.setLayout(new FlowLayout());

         jTextField = new JTextField(10);
         jButton = new JButton("Click");
         c.add(jTextField);
         c.add(jButton);

         jButton.addActionListener(new lister());
         jTextField.addActionListener(new lister());
         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jFrame.setSize(200,150);
         jFrame.setVisible(true);
    }


}
class lister implements ActionListener
{
    JTextField jTextField1;
    public void actionPerformed(ActionEvent ae)
    {
//        if(ae.getSource() == jTextField)
//        {
//            jTextField1 = (JTextField)ae.getSource();
//            System.out.println(jTextField.getText());
//        }
//        else
//        {
//            System.out.println(jTextField1.getText());
//        }

    }

}