class Demo{
	public static void main(String args[]){
		System.out.println("hoi");
		int getal = 34;
		System.out.println(getal);
		double kommagetal = 55.6;
		System.out.println(kommagetal);
		String woord = "woensdag";
		System.out.println(woord);
		Speler speler1 = new Speler();
		Speler speler2 = new Speler();
		speler1.voornaam = "Johan";
		System.out.println(speler1.voornaam);
		System.out.println(speler1);
		System.out.println(speler1.leeftijd);
		System.out.println(speler2.voornaam);
		speler1.voorstellen();
	}

}
///  methode functie   ()
class Speler{
	String voornaam;
	int leeftijd;
	void voorstellen(){
		System.out.println("Hoi ik ben: "+voornaam);
	}
}







class Schaakspel{
	Speler zwart;
	Speler wit;
}

// Object OOP Class Object


// Klasse		kenmerken	allemaal delen 		Voornaam
// Object		kenmerken	iedereen verschillend	Felix


// Klasse		Kenmerken
// Object		Waarde van kenmerken

// Klasse Objecten		Object -> uitgietsel van een klasse

// Klasse		Bouwtekening	Ovenschaal	Idee van Plato
// Object		Huis		Lasagne		Fysieke verschijning