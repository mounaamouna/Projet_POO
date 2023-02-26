package projectpoo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BDD {
    private ArrayList<Product> products;
    private JPanel frame;
    private JTable table;

    public BDD() {
        this.products = new ArrayList<>();

        this.frame = new JPanel();
        this.table = new JTable();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nom");
        model.addColumn("Reference");
        model.addColumn("Prix");
        model.addColumn("Category");

        table.setModel(model);

        frame.add(new JScrollPane(table));
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



        
        frame.setVisible(true);
    }
   
    
    public ArrayList<Product> getData() {
        ArrayList<Product> productList = new ArrayList<Product>();

        return productList;
    }


    public void addProduct(Product product) {
        this.products.add(product);

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object[] row = new Object[] {product.getName(), product.getRef(), product.getPrice(), product.getCategory()};
        model.addRow(row);
    }

   

    public boolean removeProduct(String reference) throws IOException {
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getRef().equals(reference)) {
                this.products.remove(i);
                
                
                
                displayTable();
                
                return true;
            }
        }
        
        FileWriter fileWrite = new FileWriter("rows.txt");
        for(var product : this.products) {
        	fileWrite.write(product.getRef() + " " + product.getName() + " " + product.getCategory() + " " + product.getPrice());
        }
        
        return false;
    }
    public JPanel displayTable() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.setRowCount(0);

        for (Product product : this.products) {
            Object[] row = new Object[] {product.getName(), product.getRef(), product.getPrice(), product.getCategory()};
            model.addRow(row);
        }
		return frame;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
}
