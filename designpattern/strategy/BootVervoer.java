package designpattern.strategy;

public class BootVervoer implements VervoersWijze{
	
	public int vervoeren(Pallet pallet) {
		return pallet.getGewicht() * pallet.getHoogte();
	}
	public String beschrijvenVanVervoer(Pallet pallet) {
		return "Het varen met de Boot kost " + (pallet.getGewicht() * pallet.getHoogte()) ;		
	}
	
}
