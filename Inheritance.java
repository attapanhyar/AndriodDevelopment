class Box{
	private int hieght;
	private int width;
	private int length;

	Box(){
		hieght =10;
		width = 20;
		length = 30;


	}

	public void SetHeight(int h){
		this.hieght=h;
	}
	public void SetWidth(int w){
		this.width=w;
	}

	public void SetLength(int l){
		this.length=l;
	}

	////Seting Get Method
	public int getHeight(){
		return this.hieght;
	}
	public int getWidth(){
		return this.width;
	}

	public int getLength(){
		return this.length;
	}







}
public class Inheritance{
	public static void main(String aa[]){

		Box box1 = new Box();
		box1.SetWidth(50);
		box1.SetHeight(100);
		box1.SetLength(1000);
		System.out.println(box1.getLength());

		System.out.println(box1.getWidth());

		System.out.println(box1.getHeight());
	}


}