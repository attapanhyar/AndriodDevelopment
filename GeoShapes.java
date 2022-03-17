import java.util.Scanner;

public class GeoShapes{
	public static void main(String aa[]){
	Scanner obj = new Scanner(System.in);	
	int choice;
	System.out.println(".......Geometric Shapes.....");
do{	
System.out.print("Which geometric shape you want to learn. Select form the following. \n1. Rectangle \n2. Cicle\n3.Triangle\n0. Exit \nEnter Choice");
	choice = obj.nextInt();
	
	System.out.println();

	if(choice == 1){
		System.out.println("Rectangle is a Geometric shape.\nThe length and width of rectangle is always different.");
	}
	else if(choice ==2){
		System.out.println("Circle is a geomeric shape which is oval. \n The Area of Circle can be calculated by formula: Pi*r^2. \n THe diameter of the circle is twice of its raduis.\n The Circumphere can be calculated by formula 2*pi*r");
}
	else if(choice ==3){
	System.out.println("The Triangle is a geometric shape. The area of a triangle is calculated by formula: (1/2)*length*width");


}
	else{
		System.out.println("Invalid Choice...");
}
}while(choice != 0);


}

}