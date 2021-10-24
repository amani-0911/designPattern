package strategy.calculIGR;

public class Employe {
	private String cin; 
	private float salaireBrutMensuel; 
	private Ipays pays;
	public Employe(String cin, float salaireBrutMensuel) { 
	this.cin = cin; 
	this.salaireBrutMensuel = salaireBrutMensuel; 
	} 
	public float calculerIGR(){ 
	return pays.calculIGR(salaireBrutMensuel);
	} 
	public float getSalaireNetMensuel(){ 
	float igr=calculerIGR(); 
	float salaireNetAnuel=salaireBrutMensuel*12-igr; 
	return salaireNetAnuel/12; 
}
	public void setPays(Ipays pays) {
		this.pays = pays;
	}
}