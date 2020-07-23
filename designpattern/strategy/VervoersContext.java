package designpattern.strategy;

public class VervoersContext {

	private VervoersWijze vw;
	
	public VervoersContext(VervoersWijze vw) {
		this.vw = vw;
	}
	
	public String vervoerUitvoeren(Pallet pallet) {
		System.out.println("Het vervoeren kost: "+ vw.vervoeren(pallet));
		return vw.beschrijvenVanVervoer(pallet);
	}
}
