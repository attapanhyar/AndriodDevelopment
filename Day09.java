import java.util.Scanner;
public class Day09{

	static void Welcome(){
		System.out.println("**********************************");
		System.out.println("Welcome to POPEY Super Store");
		System.out.println("Which Department you want to visit?");
		System.out.println("1. Cosmatics \n2. Crockery \n3. Grocerry");

	}
	static void cosmatics(){
		System.out.println("Welcome to Our Cosmatics Department");

		System.out.println("We sell some of the best cosmetics product in the World");


	}

	static void Grocerry(){
		System.out.println("Welcome to Our Grocerry Department");

		System.out.println("We sell some of the best Grocerry product in the World");


	}

	static void Crockery(){
		System.out.println("Welcome to Our Crocker Department");

		System.out.println("We sell some of the best Crocker product in the World");


	}


	public static void main(String aa[]){
		Scanner obj= new Scanner(System.in);
		Welcome();
		int choice;
		System.out.print("Enter the chioce: ");
		choice = obj.nextInt();

		if(choice ==1){
			cosmatics();
		}
		else if(choice ==2){
			Crockery();
		}
		else if(choice ==3){
			Grocerry();
		}
	}	



}