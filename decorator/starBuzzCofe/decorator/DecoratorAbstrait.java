package decorator.starBuzzCofe.decorator;

import decorator.starBuzzCofe.composant.Boisson;

public abstract class DecoratorAbstrait extends Boisson {
  protected Boisson boisson;

 
public DecoratorAbstrait(Boisson boisson) {
	this.boisson = boisson;
}

	public abstract String getDescription() ;
  
}
