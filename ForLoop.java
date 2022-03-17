import java.util.Scanner;
public class ForLoop{
	public static void main(String aa[]){
	Scanner obj = new Scanner(System.in);
	//System.out.print("How many Repetitions? ");
	//int x = obj.nextInt();
	int x = Integer.parseInt(aa[0]);
	for (int i =x;i>=1;i--){
	System.out.print("\nIteration NO: "+i);
	}

}

}