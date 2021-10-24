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
		 System.out.println("temperature: "+lastt+"�C �  "+datepre+"\t"+t+"�C �  "+newdate);
		 System.out.println("humidite: "+lasth+"% � "+datepre+"\t"+h+"% � "+newdate);
		 System.out.println("pression: "+lastp+"hPa � "+datepre+"\t"+p+"hPa � "+newdate);
		 
		}else{
			 System.out.println("temperature:"+t+"�C a"+newdate);
			 System.out.println("humidite: "+"\t"+h+"% a"+newdate);
			 System.out.println("pression: "+p+"hPa a"+newdate);
		}
		 lastt=t;
		 lasth=h;
		 lastp=p;
		 datepre=newdate;
		
	}

}
