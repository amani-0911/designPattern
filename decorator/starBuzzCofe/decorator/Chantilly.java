package decorator.starBuzzCofe.decorator;

import decorator.starBuzzCofe.composant.Boisson;

public class Chantilly extends DecoratorAbstrait {

	public Chantilly(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		
		return "Au chantilly";
	}

	@Override
	public double cout() {
		
		return 2.5+boisson.cout();
	}

}
