package strategy.calculIGR;

public class Maroc implements Ipays {

	@Override
	public float calculIGR(float salaireBrutMensuel) {
		float salaireBrutAnuel=salaireBrutMensuel*12; 
		float taux=5; 
	if(salaireBrutAnuel>40000 && salaireBrutAnuel <120000){
		taux=20;
	}
	else if( salaireBrutAnuel >120000){
		taux=20;
	}
	return salaireBrutAnuel*taux/100; 

	}

}
