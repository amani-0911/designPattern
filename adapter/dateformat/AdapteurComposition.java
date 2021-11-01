package adapter.dateformat;

public class AdapteurComposition implements Standard {
 private ImplAdaper adaptee=new ImplAdaper();
	@Override
	public void operation(int nbjours, int nbmois, int nbanne) {
		System.out.println("local date format :"+adaptee.calcler(nbanne, nbmois, nbjours));
		
		
	}

}
