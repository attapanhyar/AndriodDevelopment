class Car{

	int speed=0;
	boolean start=false;

	public void Start(){
		this.start =true;
		System.out.println("The Vehicle has Started....");
	}
	public void Accelerate(){
		if (this.start==true) {this.speed+=5;
		System.out.println("VROOOOOM...!");
	}
		else{
		System.out.println("You have'nt start the Car");}
	}

	public void Brake(){
		if(this.start && this.speed>=5){
			this.speed -=5;

		}
		else{
			System.out.println("Brakes has no effect...");

		}
	}
	public void show(){
		if(this.start){
		System.out.println("The current speed is"+this.speed);}
		else{
			System.out.println("The current speed is"+this.speed+"\n because you have'nt started the Car. ");
		}
	}
}

public class SpeedCar{
	public static void main(String aa[]){
	Car Bal = new Car();
	Bal.Start();
	Bal.Accelerate();
	Bal.show();
	Car Meh = new Car();
	Meh.Start();
	Meh.Accelerate();
	Meh.Brake();
	Meh.Brake();
	Meh.show();




	}


}


