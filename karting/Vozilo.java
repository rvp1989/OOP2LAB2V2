package karting;

public class Vozilo extends Thread{


	private double MaksBrzina;
	private double Ubrzanje;
	String imeTakmicara;
	private double Upravljivost;
    private double TrenBrzina;
    private double put;
    private double orgbr;
    private volatile boolean radi=false;
    
    public Vozilo(double vm,double ub,double up,String ime)
    {
    	MaksBrzina=vm;
    	Ubrzanje=ub;
    	if(up>=0 && up<=1)
    	    Upravljivost=up;
    	imeTakmicara=ime;
    	if(TrenBrzina <=vm)
    	    TrenBrzina=0;
    	orgbr=MaksBrzina;
    }

    

	public double getOrgbr() {
		return orgbr;
	}



	public  double dohvMaksBrzinu() {
		return MaksBrzina;
	}


	public  void postMaksBrzinu(double maksBrzina) {
		if(TrenBrzina>MaksBrzina)
			TrenBrzina=MaksBrzina;
		MaksBrzina = maksBrzina;
	}


	public  double dohvUbrzanje() {
		return Ubrzanje;
	}


	public  void postUbrzanje(double ubrzanje) {
		Ubrzanje = ubrzanje;
	}


	public  String dohvIme() {
		return imeTakmicara;
	}


	public  void postImeTakmicara(String imeTakmicara) {
		this.imeTakmicara = imeTakmicara;
	}


	public  double dohvUpravljivost() {
		return Upravljivost;
	}


	public  void postUpravljivost(double upravljivost) {
		Upravljivost = upravljivost;
	}


	public double dohvTrenBrzinu() {
		return TrenBrzina;
	}


	public void postTrenBrzinu(double trenBrzina) {
		TrenBrzina =trenBrzina;
	}


   public double izracunajVreme(double s)
   {
	   double vna;
	   double uu = (MaksBrzina-TrenBrzina)/Ubrzanje;
	   double ss=TrenBrzina*uu+(Ubrzanje*uu*uu)/2;
	   if(s>=ss)
	   {
		   return (uu+(s-ss)/MaksBrzina);
	   }else 
		   vna=(Math.sqrt(TrenBrzina*TrenBrzina+2*Ubrzanje*s));
		   return vna;
				   
   }
   
   public double pomeriVozilo(double f)
   {
	   double s = 0;
	   double uu = (MaksBrzina-TrenBrzina)/Ubrzanje;
	   if(uu>=f)
	   {
		   s=TrenBrzina*f+(Ubrzanje*f*f)/2;
		   TrenBrzina = TrenBrzina+Ubrzanje*f;
	   }else {
		   double nn = f-uu;
		   s=TrenBrzina*uu+(Ubrzanje*uu)/2;
		   s+=MaksBrzina*nn;
		   TrenBrzina = MaksBrzina;
	   }
	   return s;
   }
   
   public String toString()
   {
	   return imeTakmicara + "[" + MaksBrzina + "," + Ubrzanje + "," +  Upravljivost + "]";
   }
   
}


//uu->Trenutno ubr.
//ss-> S. ubr.
//nn->Ravnomerno
