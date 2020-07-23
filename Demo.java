class Demo {
	public static void main(String[] args) {
		new Kassa().starten();
	}
}
class Kassa{
	Attractie a = new BotsAuto();
	Attractie ladd = new LadderKlimmen();
	
	void starten() {
		
		a.draaien();
		ladd.draaien();
		ladd.draaien();
		ladd.draaien();
		ladd.draaien();
		
		BelastingInspecteur bi = new BelastingInspecteur();
		bi.belastingInnen(  (LadderKlimmen)ladd    );
	}
}

class BelastingInspecteur{
	void belastingInnen(GokAttractie g) {
		g.betalen();
	}
}


class LadderKlimmen extends Attractie implements GokAttractie{
	public void betalen() {
		System.out.println("Ik betaal 50 % van " + prijs + " keer mijn bezoeken" +aantalKeerBezocht);
	}
}

class Attractie{
	int prijs;
	int aantalKeerBezocht;
	void draaien() {
		prijs += 220;
		aantalKeerBezocht++;
	}
}

class BotsAuto extends Attractie{}

interface GokAttractie{
	void betalen();
}
