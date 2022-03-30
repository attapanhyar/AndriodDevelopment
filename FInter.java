interface Demo{
	void show();
	void Print();
}


public class FInter implements Demo{
		public void show(){
		System.out.println("My First Interface Implemented");
		}

		public static void main(String aa[]){

		FInter f = new FInter();
		f.show();

		}


}