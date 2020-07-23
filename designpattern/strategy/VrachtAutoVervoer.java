package designpattern.strategy;

public class VrachtAutoVervoer implements VervoersWijze {
	private int benzineprijs;
	
	public VrachtAutoVervoer(int bezineprijs) {
		this.benzineprijs = bezineprijs;
	}
	
	

	public int getBenzineprijs() {
		return benzineprijs;
	}



	public void setBenzineprijs(int bezineprijs) {
		this.benzineprijs = bezineprijs;
	}



	@Override
	public int vervoeren(Pallet pallet) {
		int totaal = pallet.getBreedte() * pallet.getHoogte() * pallet.getDiepte();
		return totaal / benzineprijs;
	}

	@Override
	public String beschrijvenVanVervoer(Pallet pallet) {
		return "We rijden in de vrachtauto "+ vervoeren(pallet);
	}
}
