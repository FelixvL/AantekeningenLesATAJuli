import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Chaffeur c = new Chaffeur();
		c.aanhetwerkgaan(   new Voertuig()    );
		c.aanhetwerkgaan(   new Paard()    );
	//	c.aanhetwerkgaan(   new Kast()    ); //wordt niet geaccepteerd
	}
}
class Pet{}
class Chaffeur{
	Pet pet;  // fields
	void aanhetwerkgaan(Bestuurbaar b) {
		b.besturen();
	}
}
interface Bestuurbaar{
	void besturen();
}
class Voertuig implements Bestuurbaar{
	public void besturen() {
		System.out.println("Besturen in Voertuig");
	}
}
class Kast{}
class Dier {}
class Paard extends Dier implements Bestuurbaar{
	public void besturen() {
		System.out.println("Besturen in Paard");
	}
}
class Koe extends Dier{}
class Computer implements Bestuurbaar{
	public void besturen() {
		System.out.println("Besturen in Computer");
	}
}
