public class Circle{
	public static void main(String aa[]){
		// A = pi*r*r;
		// C = 2*pi*r
		// D = 2*r
		//  Perimter = Sum of all sides
		// Area of Rect = length*width
	double pi = 3.142;
	double r =Double.parseDouble(aa[0]);

	double Area = pi*r*r;
	double C = 2*pi*r;	
	double dia = 2*r;
	System.out.println("Area of the Circle is: "+Area + " sq-meter");
	System.out.println("Circumpherence of the Circle is: "+C + " sq-meter");
	System.out.println("Diameter of the Circle is: "+dia + " sq-meter");

	

	}


}