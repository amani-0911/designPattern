package decorator.starBuzzCofe.decorator;

import decorator.starBuzzCofe.composant.Boisson;

public class Chocolat extends DecoratorAbstrait {

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		
		return "Au chocolat";
	}

	@Override
	public double cout() {
		
		return 1.5+boisson.cout();
	}

}
