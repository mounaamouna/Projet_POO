package projectpoo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;

public class ProductForm extends JFrame {
    private JTextField nameField;
    private JTextField referenceField;
    private JTextField priceField;
    private JComboBox<String> categoryComboBox;
    private BDD bdd;
    private JTable table;

    public ProductForm() {
        super("Product Form");

        JLabel nameLabel = new JLabel("Nom:");
        JLabel referenceLabel = new JLabel("Reference:");
        JLabel priceLabel = new JLabel("Prix:");
        JLabel categoryLabel = new JLabel("Categories:");

        this.nameField = new JTextField();
        this.referenceField = new JTextField();
        this.priceField = new JTextField();

        this.categoryComboBox = new JComboBox<>(new String[]{"ACRYLIQUE", "GLYCERO", "FACADE","MURALE"});

        JButton addButton = new JButton("Ajouter");
        JButton deleteButton = new JButton("Supprimer");
        this.add(addButton);
        this.add(deleteButton);
        addButton.setBackground(Color.WHITE);
        deleteButton.setBackground(Color.WHITE);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String reference = referenceField.getText();
                String price = priceField.getText();
                String category = (String) categoryComboBox.getSelectedItem();

                if (name.isEmpty() || reference.isEmpty() || price.isEmpty()) {
                    JOptionPane.showMessageDialog(ProductForm.this, "Veuillez remplir tous les champs.", "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Product newProduct = new Product(name, reference, price, category);
                bdd.addProduct(newProduct);
                
                DefaultTableModel model = (DefaultTableModel) table.getModel();

                model.setRowCount(0);
                String[] a = new String[5];
                for (Product product : bdd.getData()) {
                    a[0] = product.getName();
                    a[1] = product.getRef();
                    a[2] = product.getPrice();
                    a[3] = product.getCategory();
                    model.addRow(a);
                    
                }
                bdd.getData().add(newProduct);
                nameField.setText("");
                referenceField.setText("");
                priceField.setText("");
            }
        });



        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String reference = JOptionPane.showInputDialog("Enter the reference of the product to delete:");
                if (reference != null) {
                    boolean success = false;
					try {
						success = bdd.removeProduct(reference);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                    if (success) {
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.setRowCount(0);
                        for (Product product : bdd.getData()) {
                            String[] a = new String[4];
                            a[0] = product.getName();
                            a[1] = product.getRef();
                            a[2] = product.getPrice();
                            a[3] = product.getCategory();
                            model.addRow(a);
                        }
                    } else {
                        JOptionPane.showMessageDialog(ProductForm.this, "Product not found.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });


        this.bdd = new BDD();

        DefaultTableModel model = new DefaultTableModel(new String[]{"Reference", "Nom", "Prix", "Category"}, 0);
        String [] a = null ;
        for (Product product : bdd.getData()) {
        	a[1] = product.getName();
        	a[2] = product.getRef();
        	a[3] = product.getPrice();
        	a[4] = product.getCategory();
            model.addRow(a);
        }
        this.table = new JTable(model);
        
        JPanel p = bdd.displayTable();

        JScrollPane scrollPane = new JScrollPane(this.table);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(4, 2));
        formPanel.add(nameLabel);
        formPanel.add(this.nameField);
        formPanel.add(referenceLabel);
        formPanel.add(this.referenceField);
        formPanel.add(priceLabel);
        formPanel.add(this.priceField);
        formPanel.add(categoryLabel);
        formPanel.add(this.categoryComboBox);
        
        p.add(scrollPane);
        
        contentPane.add(formPanel, BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        contentPane.add(buttonPanel, BorderLayout.CENTER);
        contentPane.add(p, BorderLayout.SOUTH);
        this.setSize(500, 600);
        this.setVisible(true);
    }

    public static void main(String[] args) {

    	ProductForm form = new ProductForm();
    }
}
