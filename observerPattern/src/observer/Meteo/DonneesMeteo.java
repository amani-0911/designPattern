package observer.Meteo;

import java.util.ArrayList;
import java.util.List;

public class DonneesMeteo implements IDonnesMeteo {
  double temperature,humidite,pression;
  
  List<IAffichage> affichages=new ArrayList<IAffichage>();
  

  

@Override
  public void subscibe(IAffichage affichage) {
  	
	  affichages.add(affichage);
  }

  @Override
  public void unsubscibe(IAffichage affichage) {
	  affichages.remove(affichage);
  	
  }

  @Override
  public void actualiserMesures() {
  	double t=getTemperature();
  	double h=getHumidite();
  	double p=getPression();
  	for (IAffichage a : affichages) {
		a.actualiser(t, h, p);
	}
  	
  }
  
  
  
  
  
public double getTemperature() {
	return temperature;
}

public void setTemperature(double temperature) {
	this.temperature = temperature;
	
}

public double getHumidite() {
	return humidite;
}

public void setHumidite(double humidite) {
	this.humidite = humidite;
	
}

public double getPression() {
	return pression;
}

public void setPression(double pression) {
	this.pression = pression;
	
}


  
}
