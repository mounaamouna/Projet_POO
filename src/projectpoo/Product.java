package projectpoo;

public class Product {
   
	private String name;
    private String price;
    private String cat;
	private String ref;
	private int Quantity;


    public Product(String name, String ref, String price, String Categorie) {
        this.ref = ref;
        this.name = name;
        this.price = price;
        this.cat = Categorie;
   ;
    }

    public Product(String name, String ref, String price, String categorie, int Quantity) {
		// TODO Auto-generated constructor stub
	}

	public String getRef() {
        return this.ref;
    }

    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

	public String getCategory() {
		String t = this.cat;
		return t;
	}

	

		public void setName (String name) {
			// TODO Auto-generated method stub
			
		}

		public void setRef(String reference) {
			// TODO Auto-generated method stub
			
		}

		public void setPrice(String price2) {
			// TODO Auto-generated method stub
			
		}

		public void setPrice(double price2) {
			// TODO Auto-generated method stub
			
		}

		public int getQuantity() {
			return Quantity;
		}

		public void setQuantity(int qte) {
			Quantity = qte;
		}

	
	


}
