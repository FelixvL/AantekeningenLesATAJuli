class Demo {
	public static void main(String[] args) {
		Overschrijving ov = new Overschrijving();
//		ov.bedrag = -50;
		ov.setBedrag(-75);
		ov.uitvoeren();
		ov.uitvoeren();
		ov.uitvoeren();
		ov.uitvoeren();
	}
}


class Overschrijving{
	private int bedrag;
	
	public void setBedrag(int hoogte) {
		if(hoogte < 0) {
			System.out.println("dit gaat niet door, we bellen de politie");
		}else {
			bedrag = hoogte;
		}
	}
	
	void uitvoeren() {
		System.out.println("Bij mij gaat er "+bedrag+" af en bij jou komt er "+bedrag+" bij");
	}
}







// Design Pattern

// eigenschappen   -> effect

// Encapsulation

//	maakt field private, maak een publieke methode die het veld instelt						--> ik wil controle over mijn velden


// Strategy Template Factory