class Demo {   // instantieren
	public static void main(String[] args) {
		System.out.println("hoi");
		//Laptop laptop; // variable   // Declareren 1 x
		
		Laptop laptop = new Laptop();
		laptop.prijs = 25;
		
		Laptop laptop2 = new Laptop();
		laptop2.prijs = 45;
		
		System.out.println(">>"+ laptop.prijs);
		
		// laptop van 45 euro wil ik 2000 gram laten wegen
		laptop2.gewicht = 2000;		
		laptop.gewicht = 1500;
		
		laptop2.opstarten();
		laptop.opstarten();
		
	}
	
}

class Laptop{
	String ToEtSeNbOrD;
	String beeldscherm;
	int prijs;
	int gewicht;
	
	void opstarten() {
		System.out.println("Opstarten");
		System.out.println("mijn prijs : "+ prijs);
		System.out.println("mijn gewicht : "+ gewicht);
	}
	
}
class Auto{
	void opstarten() {
		System.out.println("opstarten in auto");
	}
}