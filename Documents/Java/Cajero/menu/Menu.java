package menu;

import java.io.*;
import datos.Cuenta;
public class Menu{
	private Cuenta account;
	public void cleaner(){
		for(int i = 0; i<25;i++){
			System.out.println("");
		}
	}

	//Menues	
	
	public void addAccount(){
		cleaner();
		account = new Cuenta();
		System.out.println("You have to create an account before continue");
		System.out.print("Insert the your name      	: ");
		account.setName(reader());
		System.out.print("Insert your initial amount	: ");
		account.setAmount(readDouble());
		System.out.print("Insert the number	    	: ");
		account.setNumber(readInt());
		System.out.println("Account created successfully!");
		accountDetails(account);
		reader();
	}
	
	public void mainMenu(){
		boolean exit = false;
		while(!exit){
		cleaner();
			System.out.println("Welcome to the ATM System");
			System.out.println("1. Withdraw Money");
			System.out.println("2. Deposit Money");
			System.out.println("3. Transfer Money");
			System.out.println("4. Account Status");
			System.out.println("5. Exit");
			System.out.print("What would you like to do? : ");
			int op = readInt();
			switch(op){
				case 1:
					withdrawMenu();
					break;
				case 2:
					depositMenu();
					break;
				case 3:
					break;				
				case 4:
					accountDetails(account);
					break;
				case 5:
					System.out.println("Are you sure to leave the system?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					int i = readInt();
					if(i==1){
						System.out.println("Thanks for use our service!! GoodBye!");
						exit = true;
					}					
					break;
				default:
					System.out.println("You have selected a wrong option!");
					System.out.println("Make you sure of your choise and try again!");
					reader();
					break;
			}
		}
	}

	public void withdrawMenu(){

		boolean exit = false;
		while(!exit){
			cleaner();
			System.out.println("Withdraw Menu");
			System.out.println("1. 500");
			System.out.println("2. 1000");
			System.out.println("3. 2000");
			System.out.println("4. Specify");
			System.out.println("5. Exit");
			System.out.print("What would you like to do? : ");
			int op = readInt();
			switch(op){
				case 1:
					exit = account.withdrawMoney(500);
					reader();
					break;
				case 2:
					exit = account.withdrawMoney(1000);
					reader();
					break;
				case 3:
					exit = account.withdrawMoney(2000);
					reader();
					break;
				case 4:
					System.out.print("Type the amount you'd like to get: ");
					exit = account.withdrawMoney(readDouble());
					reader();
					break;
				case 5:
					exit = true;
					break;
				default:
					System.out.println("You have selected a wrong option!");
					System.out.println("Make sure your choice and try again!");
					reader();
					break;
			}
		}
	}


	public void depositMenu(){

		boolean exit = false;
		while(!exit){
			cleaner();
			System.out.println("Deposit Menu");
			System.out.println("1. 500");
			System.out.println("2. 1000");
			System.out.println("3. 2000");
			System.out.println("4. Specify");
			System.out.println("5. Exit");
			System.out.print("What would you like to do? : ");
			int op = readInt();
			switch(op){
				case 1:
					exit = account.depositMoney(500);
					reader();
					break;
				case 2:
					exit = account.depositMoney(1000);
					reader();
					break;
				case 3:
					exit = account.depositMoney(2000);
					reader();
					break;
				case 4:
					System.out.print("Type the amount you'd like to get: ");
					exit = account.depositMoney(readDouble());
					reader();
					break;
				case 5:
					exit = true;
					break;
				default:
					System.out.println("You have selected a wrong option!");
					System.out.println("Make sure your choice and try again!");
					reader();
					break;
			}
		}
	}
	

/**This method read and return an int value and catch whatever exception*/
	public int readInt(){
		boolean correct = false;
		while(!correct){
			try{
				int o = Integer.parseInt(reader());
				correct = true;		 
				return o;
			}catch(Exception ex){
				System.out.println("You have introduced unknown values, please try again!");
				System.out.print("\nTry again: ");
			}
		}
		return 0;
	}

/**This method read and return a double value and catch whatever exception*/
	public double readDouble(){
		boolean correct = false;
		while(!correct){
			try{
				double o = Double.parseDouble(reader());
				correct = true;		 
				return o;
			}catch(Exception ex){
				System.out.println("You have introduced unknown values, please try again!");
				System.out.print("\nTry again: ");
			}
		}
		return 0;
	}
/**This method read and return a String value and catch whatever exception*/
	public String reader(){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			return br.readLine();
		}
		catch(IOException ex){
		}
		catch(Exception ex){
		}
		return "33";
	}

/**This method shows the information about an account*/	
	public void accountDetails(Cuenta c){
		cleaner();
		System.out.println("Account Details");
		System.out.println("Name   : " +c.getName());
		System.out.println("Amount : " +c.getAmount());
		System.out.println("Number : " +c.getNumber());
	}
}
