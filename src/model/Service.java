package model;

public class Service{

	public final static String CORTE_DE_CABELLO = "Corte de cabello";

	public final static String MANICURE = "Manicure";

	public final static String PEDICURE = "Pedicure";

	private String name;

	private int ntimes;

	private int income;

	private int taxCollection;



	public Service(String name,  int ntimes, int income, int taxCollection){

		this.name = name;

		this.ntimes = ntimes;

		this.income = income;

		this.taxCollection = taxCollection;
	}


	public String getName(){

		return name;
	}

	public void setName(String name){

		this.name = name;
	}

	public int getNtimes(){

		return ntimes;
	}

	public void setNtimes(int ntimes){

		this.ntimes = ntimes;
	}

	public int getIncome(){

		return income;
	}

	public void setIncome(int income){

		this.income = income;
	}

	public int getTaxCollection(){

		return taxCollection;
	}

	public void setTaxCollection(int taxCollection){

		this.taxCollection = taxCollection;
	}

	public promedioDeIngresoPorServicio(){

		
	}
}