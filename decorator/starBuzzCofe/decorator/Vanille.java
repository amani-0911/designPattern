package decorator.starBuzzCofe.decorator;

import decorator.starBuzzCofe.composant.Boisson;

public class Vanille extends DecoratorAbstrait {

	public Vanille(Boisson boisson) {
		super(boisson);
	}

	@Override
	public String getDescription() {
		
		return "Au vanille";
	}

	@Override
	public double cout() {
		
		return 0.7+boisson.cout();
	}

}
