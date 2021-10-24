package observer.Meteo;

public interface IDonnesMeteo {
public void actualiserMesures();
public void subscibe(IAffichage affichage);
public void unsubscibe(IAffichage affichage);
}
