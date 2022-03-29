// Exception Handling
import java.util.Scanner;
public class ExceHan{
	public static void main(String aa[]){
		Scanner obj= new Scanner(System.in);
		double arr[] = new double[2];
		
		arr[0]=1; 
		arr[1]=3; 
		

		try{
		
		arr[2]=5;
		double a,b;
		double result;
		System.out.print("ENter the first Number: ");
		a = obj.nextDouble();
		System.out.print("\nENter the Second Number: ");
		b = obj.nextDouble();
		result =a/b;
		System.out.println("The Result is "+result);

		}
		catch(Exception ae){

			System.out.println("Exception Caught");

		}

		finally{

			System.out.println("Finally is always executed");
		} 
		





		



	}



}