import java.util.Scanner;
public class Rectangle{
	public static void main(String aa[]){
	Scanner obj = new Scanner(System.in);
	double Area,per, len, width;

	System.out.print("Enter the Length of Rect: ");
	len = obj.nextInt();

	System.out.print("\nEnter the Width of Rect: ");
	width = obj.nextInt();

	Area = len*width;
	System.out.println("\nThe Area of Rect is: "+Area);
	per = 2*len+2*width;
	System.out.println("The Perimeter of Rect is: "+per);

}


}