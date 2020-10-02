import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		Speler speler1 = new Speler();
		speler1.voornaam = "Johan";
		speler1.voorstellen();
		Scanner scanner1 = new Scanner(System.in);
		String test = scanner1.nextLine();
		speler1.nieuweNaamGeven("Frits"+test);  // argument
		speler1.voorstellen();
	}

}

class Speler{
	String voornaam;
	int leeftijd;
	void voorstellen(){
		System.out.println("Hoi ik ben: "+voornaam);
	}
	void nieuweNaamGeven(String nieuweNaam){  // parameter
		System.out.println("vanaf nu heet ik "+nieuweNaam);
		voornaam = nieuweNaam;
	}
}


class Schaakspel{
	Speler zwart;
	Speler wit;
	void starten(){

	}
}
// Output   Hoi ik ben Jan en speel met wit
//		Hoi ik ben Frits en ik speel met zwart


// argument parameter