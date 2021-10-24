package decorator.starBuzzCofe.decorator;

import decorator.starBuzzCofe.composant.Boisson;

public class Caramel extends DecoratorAbstrait {

	public Caramel(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		
		return "Au caramel";
	}

	@Override
	public double cout() {
		
		return 0.5+boisson.cout();
	}

}
