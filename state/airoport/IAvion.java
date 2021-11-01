package state.airoport;

public interface IAvion {
  void sortirDuGarage(); //operation de transition d'etat
  void entrerAuGarage();  //operation de transition d'etat
  void decoller(); //operation de transition d'etat
  void atterir(); //operation de transition d'etat
  void doActivity(); //activite
}
