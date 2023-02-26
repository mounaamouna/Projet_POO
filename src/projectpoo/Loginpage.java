package projectpoo;




import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class Loginpage extends JFrame implements ActionListener{
	private static JPanel panel;
	private static JFrame frame;
	private static JLabel userlabel;
	private static JTextField userText;
	private static JLabel passwordlabel;
	private static JPasswordField PasswordText;
	private static JButton button;
	private static  JLabel success;
	
	Loginpage(){
		panel = new JPanel();
	    frame = new JFrame();
		frame.setSize(350,200);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	    panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
	    frame.add(panel);
	    panel.setLayout(null);
	    
	    userlabel = new JLabel("User");
	    userlabel.setBounds(10,20,80,25);
	    panel.add(userlabel);
	    
	    userText = new JTextField(20);
	    userText.setBounds(80,20,250,25);
	    panel.add(userText);
	    
	    
	    passwordlabel = new JLabel("Password");
	    passwordlabel.setBounds(10,50,80,25);
	    panel.add(passwordlabel);
	 
	    PasswordText = new JPasswordField();
	    PasswordText.setBounds(80,50,250,25);
	    panel.add(PasswordText);	
	    
	    button = new JButton("Login");
	    button.setBounds(100,100,80,25);
	    button.setBackground(Color.WHITE);
	    button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Menu m = new Menu();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			   frame.setVisible(false);
				
				
				
			}
	    	
	    });
	    
	 

	    
	    panel.add(button);
	    
	    success = new JLabel("");
	    success.setBounds(10,130,300,25);
	    panel.add(success);
	    
	    frame.dispose();
	   
	    frame.setVisible(true);
		
	   
	   	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	 public static void main(String[] args) {
		new Loginpage();
		 
	 }
	

	
			
			



}