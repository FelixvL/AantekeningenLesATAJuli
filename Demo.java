class Demo {   // arrays
	public static void main(String[] args) {
		int[] getallen2 = {4,3,7,88,24,99, 9,7,99};
		Persoon[] personen = {new Persoon(38,"Piet"),new Persoon(28,"Marleen"),new Persoon(23,"Karin")};
		for(int x = 0 ; x < 10 ; x++) {
			System.out.println("hoi");
			System.out.println(x);
			
		}

		
		for(int y = 0 ; y < getallen2.length ; y++) {
			System.out.println("doei");
			System.out.println(getallen2[y]);
		}
		
		for(int r = 0 ; r < personen.length ; r++) {
			System.out.println(personen[r].naam);
		}
		
		String teraden = "allerleiletter";
		for(int t = 0; t < teraden.length() ; t++) {
			System.out.println(teraden.charAt(t));
		}
		
		
		
		
		
	}	
}

class Persoon{
	int leeftijd;
	String naam;
	Persoon(int leef, String nm){
		leeftijd = leef;
		naam = nm;
	}
}
