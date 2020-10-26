package karting;

public abstract class Specificnost {

	private static int posId=0;
	private int Id=++posId;
	
	public int dohvatiId() {
		return Id;
	}
	
	public void ispoljiEfekat(Object o1) throws GNeodgovarajuciObjekat
	{
		if(o1==null)throw new GNeodgovarajuciObjekat();
	}
	
	public void ponistiEfekat(Object o1) throws GNeodgovarajuciObjekat
	{
		if(o1==null)throw new GNeodgovarajuciObjekat();
	}
	
	
	

}
