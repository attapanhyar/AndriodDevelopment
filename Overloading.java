public class Overloading{
	// Add Method
	public int add(int a,int b){
		return a+b;
	}
	// Overloaded Add Method
	public int add(int a,int b, int c){
		return a+b+c;
	}


	public static void main(String aa[]){

		int x = 5;
		int y = 6;
		int z=8;

		Overloading Ov = new Overloading();

		System.out.println("Function with Two Paramters: "+Ov.add(x,y));

		System.out.println("Function with Three Paramters: "+Ov.add(x,y,z));


	}
}