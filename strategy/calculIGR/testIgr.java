package strategy.calculIGR;

public class testIgr {

	public static void main(String[] args) {
		Employe employe=new Employe("cinalgi234", 20000);
		employe.setPays(new Maroc());
		System.out.println("votre :"+employe.calculerIGR());

	}

}
