package designpattern.strategy;

public interface VervoersWijze {
	public int vervoeren(Pallet pallet);	
	public String beschrijvenVanVervoer(Pallet pallet);
}
