import java.util.Scanner;

public class PerCal{
	public static void main(String aa[]){
		Scanner obj = new Scanner(System.in);
		Scanner obj1 = new Scanner(System.in);
		String name[] = new String[2];
		double StdMm[] = new double [2];
		double StdEm[] = new double [2];
		double StdBm[] = new double [2];
		double StdPer[] = new double[2];

	for(int i = 0;i<name.length;i++){
	System.out.print("\nEnter the Name of Student: ");
	name[i] = obj1.nextLine();
	System.out.print("\nEnter the Marks for English for" + name[i]+" : ");
	StdEm[i] = obj.nextDouble();
	System.out.print("\nEnter the Marks for Math: ");
	StdMm[i] = obj.nextDouble();
	System.out.print("\nEnter the Marks for Biology: ");
	StdBm[i] = obj.nextDouble();
}
	for(int i=0;i<StdPer.length;i++){
		StdPer[i] = (StdEm[i]+StdMm[i]+StdBm[i])/300*100;
		}

	// For Printing Results

	for (int i = 0;i<name.length;i++){
	System.out.println(name[i]+ " got " + StdPer[i]+ " Percentage");
}

}



}
