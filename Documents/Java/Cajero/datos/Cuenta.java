package datos;

public class Cuenta{
	private String name;
	private	int number;
	private double amount;

	//Transactions
	public boolean withdrawMoney(double a){
		if(amount>=a){
			amount = amount - a;
			System.out.println("Transaction complete");
			System.out.println("New Balance: " + getAmount());
			return true;
		}else{
			System.out.println("You don't have enough money");
			System.out.println("Available: " + getAmount());
			System.out.println("You need : " + a);
			return false;
		}
		
	}

	public boolean depositMoney(double a){
		amount = amount + a;
		System.out.println("Transaction complete");
		System.out.println("New Balance: " + getAmount());
		return true;
	}

	//Getter and Setter
	public int getNumber(){return number;}
	public void setNumber(int number){this.number = number;}
	
	public double getAmount(){return amount;}
	public void setAmount(double amount){this.amount = amount;}

	public String getName(){return name;}
	public void setName(String name){this.name = name;}
}
