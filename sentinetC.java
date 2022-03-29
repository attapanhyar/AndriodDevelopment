import java.util.Scanner;
public class sentinetC{
	public static void main(String aa[]){
		char check;	
		Scanner obj = new Scanner(System.in);

		do{

			System.out.print("\nEnter a to exit: ");
			check = obj.nextLine().charAt(0);


		}while(check!='a');

	}


}