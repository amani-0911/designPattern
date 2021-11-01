package adapter.dateformat;

public class Application {

	public static void main(String[] args) {
		Standard standard=new ImplStandard();
		standard.operation(10, 2, 1999);
		Standard adaptee1=new AdapeturHeritage();
		adaptee1.operation(10, 2, 1999);
		Standard adaptee2=new AdapteurComposition();
		adaptee2.operation(10, 2, 1999);
	}

}
