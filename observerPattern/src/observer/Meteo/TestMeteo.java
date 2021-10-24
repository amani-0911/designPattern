package observer.Meteo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestMeteo {

	
	
	
	public static void main(String[] args) throws Exception {
		//getData from file
		Scanner sc=new Scanner(new File("data.txt"));
				
		double temp=Double.parseDouble(sc.nextLine().split(":")[1]);
		double humi=Double.parseDouble(sc.nextLine().split(":")[1]);
		double pressin=Double.parseDouble(sc.nextLine().split(":")[1]);
        //observable
		IDonnesMeteo donnesMeteo=new DonneesMeteo();
		//observers
		AffichageConditions affichageConditions=new AffichageConditions();
		AffichageStats affichageStats=new AffichageStats();
		AffichagePrevisions affichagePrevisions=new AffichagePrevisions();
		//subscibe  
		donnesMeteo.subscibe(affichageConditions);
		donnesMeteo.subscibe(affichageStats);
		donnesMeteo.subscibe(affichagePrevisions);
		
		//set data and actuliser l'affichage
		((DonneesMeteo)donnesMeteo).setTemperature(temp);
		((DonneesMeteo)donnesMeteo).setTemperature(humi);
		((DonneesMeteo)donnesMeteo).setTemperature(pressin);
		donnesMeteo.actualiserMesures();
		
		System.out.println("*********************************");
		
		//getData2 from file
				 sc=new Scanner(new File("data2.txt"));
						
				 temp=Double.parseDouble(sc.nextLine().split(":")[1]);
				 humi=Double.parseDouble(sc.nextLine().split(":")[1]);
				 pressin=Double.parseDouble(sc.nextLine().split(":")[1]);
		
				//set data and actuliser l'affichage
					((DonneesMeteo)donnesMeteo).setTemperature(temp);
					((DonneesMeteo)donnesMeteo).setTemperature(humi);
					((DonneesMeteo)donnesMeteo).setTemperature(pressin);
					donnesMeteo.actualiserMesures();


	}

}
