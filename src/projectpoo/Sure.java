package projectpoo;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Sure extends JFrame implements ActionListener{
	
	
	private static final long serialVersionUID = 1L;
	private static JPanel logoutpanel;
	private static JFrame logoutframe;
	private static JLabel logoutlabel;
	private static JButton nobutton;
	private static JButton logoutbutton;
	
	public Sure(){
		
		  logoutpanel = new JPanel();
		    logoutframe = new JFrame();
			logoutframe.setSize(300,150);
			

		    
			logoutpanel.setLayout(null);
			logoutpanel.setBackground(Color.gray);
		    logoutframe.add(logoutpanel);
		    logoutpanel.setLayout(null);
		    
		    logoutlabel = new JLabel("Are you sure?");
		    logoutlabel.setBounds(40,20, 300, 20);
		    logoutpanel.add(logoutlabel);
		    
		    
		    logoutbutton = new JButton("Logout");
		    logoutbutton.setBounds(50,60,80,25);
		    logoutbutton.setBackground(Color.WHITE);
		    logoutpanel.add(logoutbutton);
		    
		    nobutton = new JButton("Cancel");
		    nobutton.setBounds(140,60,80,25);
		    nobutton.setBackground(Color.WHITE);
		    logoutpanel.add(nobutton);
		    
		    nobutton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
		    		logoutframe.setVisible(false);
		    		
				}
		    });
		    
		    this.setTitle("Avertissement");
		    
		    logoutbutton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
		    		logoutframe.setVisible(false);
	                System.exit(0); 
				}
		    });
		    
		    
		    
		    logoutframe.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	


}
