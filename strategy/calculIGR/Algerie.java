package strategy.calculIGR;

public class Algerie implements Ipays {

	@Override
	public float calculIGR(float salaireBrutMensuel) {
		float salaireBrutAnuel=salaireBrutMensuel*12; 
		float taux=35; 
		return salaireBrutAnuel*taux/100;	}

}
