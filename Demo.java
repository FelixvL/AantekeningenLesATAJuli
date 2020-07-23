class Demo {   // has a relatie
	public static void main(String[] args) {
		Supermarkt supermarkt = new Supermarkt();
		
		supermarkt.hetProduct =  new Product("Kaas", 500);
		Klant klant = new Klant();
		klant.dinero = 900;
		klant.naam = "Piet";
		
		System.out.println(klant.dinero);
		// goed aanroepen
		supermarkt.verkopen(klant);
		supermarkt.verkopen(klant);
		System.out.println(klant.dinero);
		System.out.println("=====================");
		Klant klant2 = new Klant();
		klant2.dinero = 1900;
		klant2.naam = "Johan";
		supermarkt.verkopen(klant2);
		supermarkt.verkopen(klant2);
		System.out.println(klant2.dinero);
	}	
}

class Klant{
	String naam;
	int dinero;
}

class Supermarkt{
	Product hetProduct;
	void verkopen(Klant klant) {
		System.out.println("Welkom "+ klant.naam);
		System.out.println("Wij verkopen " + hetProduct.naamf );
		if(klant.dinero >= hetProduct.prijsf) {			
			klant.dinero -= hetProduct.prijsf;
			System.out.println("Bedankt voor uw aanschaf");
		}else {
			System.out.println("Pak de dief "+klant.naam);
		}
		System.out.println("");
	}
	
}

class Product{
	String naamf;
	int prijsf;	
	Product(String naam , int prijs){
		naamf = naam;
		prijsf = prijs;
	}
}
