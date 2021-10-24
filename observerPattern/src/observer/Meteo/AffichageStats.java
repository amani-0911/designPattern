package observer.Meteo;

import java.time.LocalDateTime;

public class AffichageStats implements IAffichage {
  private double lastt,  lasth,  lastp;
  private  LocalDateTime datepre=null;
	@Override
	public void actualiser(double t, double h, double p) {
		 LocalDateTime newdate=LocalDateTime.now();
		System.out.println("Statistique:  ");
		 System.out.println("--------------------------------");
		if(datepre !=null){
		 System.out.println("dernier\tactuel ");
		 System.out.println("temperature: "+lastt+"°C à  "+datepre+"\t"+t+"°C à  "+newdate);
		 System.out.println("humidite: "+lasth+"% à "+datepre+"\t"+h+"% à "+newdate);
		 System.out.println("pression: "+lastp+"hPa à "+datepre+"\t"+p+"hPa à "+newdate);
		 
		}else{
			 System.out.println("temperature:"+t+"°C a"+newdate);
			 System.out.println("humidite: "+"\t"+h+"% a"+newdate);
			 System.out.println("pression: "+p+"hPa a"+newdate);
		}
		 lastt=t;
		 lasth=h;
		 lastp=p;
		 datepre=newdate;
		
	}

}
