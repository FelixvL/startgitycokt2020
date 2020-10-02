import java.util.Scanner;
import java.time.*;
class Demo{
	public static void main(String args[]){
		Dier dier = new Dier();
		Dier dier2 = new Konijn();
		Konijn konijn = new Konijn();	
		//Konijn konijn2 = new Dier(); // kan niet
		//Konijn konijn3 = new Olietanker(); 
		Olietanker ot = new Olietanker();

		dier.aantalCellen = 2000000;
		konijn.aantalCellen = 1000000;
		DierenAmbulance da = new DierenAmbulance();
		da.ophalen(dier);
		da.ophalen(konijn);
		//da.ophalen(ot);  // kan niet
		dier2.aantalCellen = 300;
		//dier2.lengteOren = 3;
		((Konijn) dier2).lengteOren = 7;
	}
}
class DierenAmbulance{
	void ophalen(Dier dier){
		System.out.println("ophalen"+ dier.aantalCellen);
		dier.voortplanten();
	}
}


class Olietanker{}
class Dier{    // parent base
	int aantalCellen;
	void voortplanten(){
		System.out.println("voortplanten in dier");
	}
}
class Konijn extends Dier{   // is a    child subclass Covariant -->richting 3 antwoorden
	int lengteOren;
	void wortelsEten(){
		System.out.println("wortelseten in Konijn");
	}
	void voortplanten(){
		System.out.println("voortplanten in konijn");
	}
}





class Boek{  // relaties 2 soorten      is - a
	static String uitvinder;     // has - a    boek.deSchrijver
	Schrijver deSchrijver;		//  has - a

}
class Schrijver{
	String naam;
	LocalDateTime geboortedatum;
}