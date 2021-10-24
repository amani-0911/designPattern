package strategy.calculIGR;

public class Tunisie implements Ipays {

	@Override
	public float calculIGR(float salaireBrutMensuel) {
		float salaireBrutAnuel=salaireBrutMensuel*12; 
		float taux=2; 
	if(salaireBrutAnuel>4000 && salaireBrutAnuel <12000){
		taux=10;
	}
	else if( salaireBrutAnuel >12000){
		taux=20;
	}
	return salaireBrutAnuel*taux/100;
	}

}
