package projectpoo;


import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menu extends JFrame implements ActionListener {
	
	private static JButton button;
	private static JLabel addLabel;
	private static Icon stockicon;
	private static JButton stockbutton;
	private static JLabel stockLabel ;
	private static Icon logouticon;
	private static JButton logoutbutton;
	private static JLabel logoutLabel;
	private static ProductForm t;
	
	Menu() throws IOException{
		JPanel Panel = new JPanel();

		
		this.setSize(655,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setTitle("MENU");
		Panel.setLayout(null);
		Panel.setBackground(Color.gray);
		this.add(Panel);
		
		Icon icon = new ImageIcon("C:\\Users\\hp\\Downloads\\shopping-cart-add.png");
		
		button = new JButton(icon);
		button.setBounds(10, 25, 200, 32);
		button.setBackground(Color.WHITE);
		Panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				 new ProductForm();
				
		}});
		
		
	    addLabel = new JLabel("ProductForm");
		addLabel.setBounds(70,3,200,25);
	
		Panel.add(addLabel);
		
		
		stockicon = new ImageIcon("C:\\Users\\hp\\Downloads\\warehouse-alt.png");
	    stockbutton = new JButton(stockicon);
	    stockbutton.setBackground(Color.WHITE);
	    stockbutton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	                ArrayList<Product> products = new ArrayList<>();
	                products.add(new Product("Noir","001","1234","GLYCERO"));
	                products.add(new Product("Jaune","002","1234","GLYCERO"));
	                products.add(new Product("Verte","003","1234","GLYCERO"));
	                products.add(new Product("Rouge","004","1234","GLYCERO"));
	                products.add(new Product("Orange","005","1234","GLYCERO"));
	                products.add(new Product("Marron","006","1234","GLYCERO"));
	                products.add(new Product("Bleu","007","1234","GLYCERO"));
	                products.add(new Product("Noir","008","1234","GLYCERO"));
	                products.add(new Product("Noir","009","1234","GLYCERO"));
	                products.add(new Product("Noir","010","1234","GLYCERO"));
	                products.add(new Product("Noir","011","1234","GLYCERO"));
	                products.add(new Product("Marron","012","1234","FACADE"));
	                products.add(new Product("Bleu","013","1234","FACADE"));
	                products.add(new Product("Noir","014","1234","FACADE"));
	                products.add(new Product("Noir","015","1234","MURALE"));
	                products.add(new Product("Noir","016","1234","ACRYLIQUE"));
	                products.add(new Product("Noir","017","1234","FACADE"));

	                new ProductList(products);
	            }
	    });

     
		stockbutton.setBounds(220, 25, 200, 32);
		Panel.add(stockbutton);
		
	    stockLabel = new JLabel("STOCK");
		stockLabel.setBounds(295,3,70,25);
		Panel.add(stockLabel);
		
	   
		
	    logouticon = new ImageIcon("C:\\Users\\hp\\Downloads\\exit.png");
	    logoutbutton = new JButton(logouticon);
		logoutbutton.setBounds(430, 25, 200, 32);
		logoutbutton.setBackground(Color.WHITE);
		Panel.add(logoutbutton);
		
		logoutbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				Sure s = new Sure();
				
		}});
		
	    logoutLabel = new JLabel("LOGOUT");
		logoutLabel.setBounds(505,3,70,25);
		Panel.add(logoutLabel);
		
		this.setVisible(true);
		
	}

	//@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	 public static void main(String [] args) throws IOException {
		new Menu();
}
}