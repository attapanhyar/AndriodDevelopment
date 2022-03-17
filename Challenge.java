import java.util.Scanner;
public class Challenge{
public static void main(String aa[]){
	Scanner obj = new Scanner(System.in);

	int marks = 0;
	int English, Maths, Sindhi;

	System.out.print("Enter the for English");
	marks = obj.nextInt();

	while( marks<0 || marks >100){
	System.out.print("\nInvalid Marks.. Please Enter Again");
	marks = obj.nextInt();
	}
	English = marks;
	System.out.println("\n English Marsk are "+ English);		


}
}