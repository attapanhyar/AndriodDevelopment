import java.util.Scanner;  // 1st step
public class Nestedif{
	public static void main(String aa[]){
	Scanner obj = new Scanner(System.in);	// Object Creation
	double English = 0;
	double Maths = 0;	
	double Bio = 0;	
	
	//nextInt(); integer
	//nextDouble();
	//nextLine() ; String

	System.out.print("Enter the Marks for English: ");
	English = obj.nextInt();
	System.out.print("\n Enter the marks for maths: ");
	Maths = obj.nextInt();
	System.out.print("\n Enter the Marks for Bio");
	Bio = obj.nextInt();
	System.out.println("");
     	double Perc = (English+Maths+Bio)/300*100;
	System.out.println("Your Percentage is "+Perc);	

	if (Perc>=80){
	System.out.println("Congratulation, you got an A-1");
}else  if(Perc >=70){
	System.out.println("A");
}else if(Perc>=60){
	System.out.println("B");
}else if (Perc>=50){
	System.out.println("C");
}else{
	System.out.println("Fail");
}
	


	}



	}