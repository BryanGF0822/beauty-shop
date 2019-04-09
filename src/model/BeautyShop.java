package model;

public class BeautyShop{

	private Employee emplo1;

	private Employee emplo2;



	//Methods


public void registerService(int typeService, int employee, int amount){
	if (employee == 1){
		if (typeService==1){
			int beforeAmount = emplo1.getS1().getNTimes();
			emplo1.getS1().setNTimes(beforeAmount+amount);
		}else 
	}else{

	}
}

	public BeautyShop(Employee emplo1, Employee emplo2){

		this.emplo1 = emplo1;

		this.emplo2 = emplo2;
	}

	public Employee getEmplo1(){

		return emplo1;
	}

	public void setEmplo1(Employee emplo1){

		this.emplo1 = emplo1;
	}

	public Employee getEmplo2(){

		return emplo2;
	}

	public void setEmplo2(Employee emplo2){

		this.emplo2 = emplo2;
	}
}