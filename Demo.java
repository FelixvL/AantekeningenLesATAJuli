class Demo {   // has a relatie
	public static void main(String[] args) {
		Supermarkt supermarkt = new Supermarkt();
		
		supermarkt.hetProduct =  new Product("Kaas", 400);
		
		
		
	}	
}


class Klant{
	String naam;
	int dinero;
}



class Supermarkt{
	Product hetProduct;
	
}

class Product{
	String naamf;
	int prijsf;
	
	Product(String naam , int prijs){
		naamf = naam;
		prijsf = prijs;
	}
}
