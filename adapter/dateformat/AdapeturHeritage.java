package adapter.dateformat;

public class AdapeturHeritage  extends ImplAdaper implements Standard{

	@Override
	public void operation(int n1, int n2, int n3) {
		System.out.println("local date format :"+calcler(n3, n2, n1));
		
	}

}
