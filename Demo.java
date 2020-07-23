class Demo {   // arrays
	public static void main(String[] args) {
		int[] getallen ;
		int[] getallen2 = {4,3,7,88,24,99, 9};
		
		Ticket[] tickets;
		Ticket[] tickets2 = { new Ticket(), new Ticket(), new Ticket() };
		
		String[] woorden;
		String[] woorden2 = {"maan","zon","ruimte"};
		
		getallen = new int[7];  // altijd weten hoe lang ze zijn
		tickets = new Ticket[6];
		woorden = new String[6];
		
		System.out.println(    getallen[3]  );
		System.out.println(    tickets[3]  );   // dit mag
//		System.out.println(    tickets[3].prijs  ); // dit is null pointer
		System.out.println(    woorden[3]  );
		
		getallen[3] = 5;
		tickets[3] = new Ticket();
		woorden[3] = "Goedeavond";
		
		System.out.println(    getallen[3]  );
		System.out.println(    tickets[3].prijs  );
		System.out.println(    woorden[3]  );
		
		
	}	
}


class Ticket{
	int prijs =38;
}

