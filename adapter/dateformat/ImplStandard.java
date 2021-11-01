package adapter.dateformat;

public class ImplStandard implements Standard{

	@Override
	public void operation(int nbjours, int nbmois, int nbanne) {
		System.out.println("date standard: "+nbjours+"/"+nbmois+"/"+nbanne);
		
	}

	
	

}
