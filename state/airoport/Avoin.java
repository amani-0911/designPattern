package state.airoport;


public class Avoin implements IAvion {
    private State state;
    
    public Avoin(){
    	state=new EtatEnPiste();
    }
	@Override
	public void sortirDuGarage() {
		state.excuteSortirDuGarage();
		
	}

	@Override
	public void entrerAuGarage() {
		state.excuteEntrerAuGarage();
		
	}

	@Override
	public void decoller() {
		state.excuteDecoller();
		
	}

	@Override
	public void atterir() {
		state.excuteAtterir();
		
	}

	@Override
	public void doActivity() {
		state.excutedoActivity();
		
	}
	abstract class State{
		abstract void excuteSortirDuGarage(); //operation de transition d'etat
		abstract  void excuteEntrerAuGarage();  //operation de transition d'etat
		abstract  void excuteDecoller(); //operation de transition d'etat
		  abstract  void excuteAtterir(); //operation de transition d'etat
		  abstract  void excutedoActivity(); //activite
	}
  class EtatEnPiste extends State{

	@Override
	void excuteSortirDuGarage() {
		System.out.println("IMpossible je suis deja En piste");
		
	}

	@Override
	void excuteEntrerAuGarage() {
		System.out.println("Transition d'etat en piste => garage");
		state=new EtatAuGarage();
	}

	@Override
	void excuteDecoller() {
		System.out.println("Transition d'etat en piste => Dècollage");
		state=new EtatEnAir();
		
	}

	@Override
	void excuteAtterir() {
		System.out.println("Impossible de Atterir");
		
	}

	@Override
	void excutedoActivity() {
		System.out.println("Activite de l'etat en piste ....");
		
	}
	  
  }
  class EtatAuGarage extends State{

		@Override
		void excuteSortirDuGarage() {
			System.out.println("Transition d'etat en  garage => piste");
			state=new EtatEnPiste();
				
		}

		@Override
		void excuteEntrerAuGarage() {
			System.out.println("IMpossible je suis deja au garage");
			
		}

		@Override
		void excuteDecoller() {
			System.out.println("IMpossible de decollage");
			
			
		}

		@Override
		void excuteAtterir() {
			System.out.println("Impossible de Atterir");
			
		}

		@Override
		void excutedoActivity() {
			System.out.println("Activite de l'etat Au garage ....");
			
		}
	  
  }
  class EtatEnAir extends State {

		@Override
		void excuteSortirDuGarage() {
			System.out.println("IMpossible je suis  En Air");
			
		}

		@Override
		void excuteEntrerAuGarage() {
			System.out.println("IMpossible je suis  En Air");
	
		}

		@Override
		void excuteDecoller() {
			System.out.println("IMpossible je suis deja En Air");
			
			
		}

		@Override
		void excuteAtterir() {
			System.out.println("Transition d'etat en  Air=> En piste");
			state=new EtatEnPiste();
			
		}

		@Override
		void excutedoActivity() {
			System.out.println("Activite de l'etat en Air ....");
			
		}

	}
}
