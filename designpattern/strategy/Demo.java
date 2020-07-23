package designpattern.strategy;

public class Demo {
	public static void main(String[] args) {
		Pallet pallet2 = new Pallet();
		pallet2.setBreedte(20);
		pallet2.setHoogte(120);
		pallet2.setDiepte(210);
		pallet2.setNaam("Kaas");
		pallet2.setGewicht(30);
		
		VervoersContext vc = new VervoersContext( new BootVervoer() );
		String uitkomst = vc.vervoerUitvoeren(pallet2);
		System.out.println(uitkomst);
	}

}
