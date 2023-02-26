package projectpoo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class ProductList extends JFrame {
    private JTable table;


    public ProductList(ArrayList<Product> products) {
        super("Product List");

        DefaultTableModel model = new DefaultTableModel(new String[]{"Reference", "Nom", "Prix", "Category"}, 0);
        for (Product product : products) {
            model.addRow(new Object[]{product.getRef(), product.getName(), product.getPrice(), product.getCategory()});
        }

        
        this.table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(this.table);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(scrollPane, BorderLayout.CENTER);
        this.getContentPane().setBackground(Color.BLACK); 

        this.setSize(500, 400);
        this.setVisible(true);
    }
  

  
	public static void main(String[] args) {
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


        ProductList list = new ProductList(products);
    }
}
