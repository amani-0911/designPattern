package observer.Meteo;

public class AffichagePrevisions implements IAffichage {

	@Override
	public void actualiser(double t, double h, double p) {
		System.out.println("Prevision:  ");
		 System.out.println("--------------------------------");
		if(t >35){
		 System.out.println("humidite va devenir : "+h+(t%30)+"%");
		 System.out.println("pression va devenir :: "+p+(t%10)+"hPa");
	}else{
		 System.out.println("humidite stable : "+h+"%");
		 System.out.println("pression stable :: "+p+"hPa");
	}
	}

}
