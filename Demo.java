class Demo {   // constructor
	public static void main(String[] args) {
		Laptop laptop = new Laptop(70, 2300);
		laptop.opstarten();
		Auto auto = new Auto();
		auto.rijden(50);
		
	}
	
}

class Laptop{
	int prijs;
	int gewicht;
	
	Laptop(int Prijs, int gewichtP){
		prijs = Prijs;
		gewicht = gewichtP;
	}
	
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
	void rijden(int snelheid) {
		System.out.println("Ik ben aan het rijden met snelheid : " + snelheid);
	}
}