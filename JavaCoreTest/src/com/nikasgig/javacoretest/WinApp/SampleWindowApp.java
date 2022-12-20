package com.nikasgig.javacoretest.WinApp;

import java.awt.FlowLayout;
import javax.swing.*;

public class SampleWindowApp extends JFrame{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label1;
    JButton button1;

    public SampleWindowApp(){
        this.setLayout( new FlowLayout() );
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Simple Window Application");

        label1 = new JLabel("This is a label.");
        this.add(label1);

        button1= new JButton("Click Me");
        this.add(button1);
    }
}