package karting;
import java.util.ArrayList;


public class Deonica implements Cloneable{

	private double duzina;
	ArrayList<Specificnost> list = new ArrayList<Specificnost>();
	public Deonica(double duz)
	{
		duzina=duz;
	}

	public double getDuzina() {
		return duzina;
	}

	public int brojSpecificnosti()
	{
		return list.size();
	}
	
	public void dodajSpecificnost(Specificnost s)
	{
		list.add(s);
	}
	
	public void izbaciSpecificnost(int s) 
	{
		if(s<=list.size() && s!=0)
		{
			list.remove(s);
		}
		
	}
	
	public Specificnost dohvSpecificnost(int s)
	{
		Specificnost t;
		t=list.get(s);
		return t;
	}
	public Deonica clone()throws CloneNotSupportedException
	{
		try
		{
			Deonica deo = (Deonica)super.clone();
			return deo;
		}catch(CloneNotSupportedException e)
		{
			return null;
		}
	}
	
	public String toString()
	{
		StringBuilder sb= new StringBuilder(" deonica "+" ( "+duzina+" m "+" ) ");
		for(Specificnost ss: list)
			sb.append(ss.toString());
		return sb.toString();
		
	}

}
