package observer.Meteo;

public class AffichageConditions implements IAffichage {

	@Override
	public void actualiser(double t, double h, double p) {
	 System.out.println("Condition Actuele:  ");
	 System.out.println("-----------------------");
	 System.out.println("temperature: "+t+"°C");
	 System.out.println("humidite: "+h+"%");
	 System.out.println("pression:"+p+"hPa");
		
	}

}
