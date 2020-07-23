package designpattern.strategy;

public class VliegtuigVervoer implements VervoersWijze{
	private int kerosineprijs;
	
	public VliegtuigVervoer(int kerosineprijs) {
		this.kerosineprijs = kerosineprijs;
	}
	
	

	public int getKerosineprijs() {
		return kerosineprijs;
	}



	public void setKerosineprijs(int kerosineprijs) {
		this.kerosineprijs = kerosineprijs;
	}



	@Override
	public int vervoeren(Pallet pallet) {
		int totaal = pallet.getBreedte() * pallet.getHoogte() * pallet.getDiepte();
		return totaal / kerosineprijs;
	}

	@Override
	public String beschrijvenVanVervoer(Pallet pallet) {
		return "We vliegen in het vliegtuig "+ vervoeren(pallet);
	}

}
