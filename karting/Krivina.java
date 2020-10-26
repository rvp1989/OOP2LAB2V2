package karting;

public class Krivina extends Specificnost implements Cloneable{

	private double MaksBrzina;
	private Vozilo vozilo;
	private double temp;

	
	public Krivina(double m)
	{
		MaksBrzina = m;
	}
	

	public void ispoljiEfekat(Object o1)throws GNeodgovarajuciObjekat
	
	{
		if(!(o1 instanceof Vozilo))
			throw new GNeodgovarajuciObjekat();
		
		Vozilo v = (Vozilo)o1;
		temp = v.dohvMaksBrzinu();
		if(MaksBrzina<=temp)
			v.postMaksBrzinu(MaksBrzina*v.dohvUpravljivost());
	}

	
     public void ponistiEfekat(Object o1)throws GNeodgovarajuciObjekat
	
	{
		if(!(o1 instanceof Vozilo))
			throw new GNeodgovarajuciObjekat();
		
		Vozilo v = (Vozilo)o1;
		v.postMaksBrzinu(temp);
	}
	
	
	public double getMaksBrzina() {
		return vozilo.dohvMaksBrzinu();
	}
	
	public Krivina clone()
	{
		Krivina kopija =new Krivina(MaksBrzina);
		return kopija;
	}
	public String toString()
	{
		return "K "+MaksBrzina;
	}
	
}
