package state.airoport;

public class Avointest {
public static void main(String[] args) {
	IAvion avion =new Avoin();
	avion.doActivity();
	
	System.out.println("------------------");
	avion.sortirDuGarage();
	avion.doActivity();
	
	System.out.println("------------------");
	avion.entrerAuGarage();
	avion.doActivity();
	

	System.out.println("------------------");
	avion.decoller();
	avion.doActivity();
	

	System.out.println("------------------");
	avion.sortirDuGarage();
	avion.decoller();
	avion.doActivity();
	
	
	
}
}
