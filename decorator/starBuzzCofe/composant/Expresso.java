package decorator.starBuzzCofe.composant;

public class Expresso extends Boisson{
   
	public Expresso(){
		description="expresso ";
	}
	
	@Override
	public double cout() {
		
		return 6;
	}

}
