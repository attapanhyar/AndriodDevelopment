// 1. Inheritance


class Employee{

	double Salary;
	double A_inc;


}


class Peon extends Employee{
	String dress = "suit";
	String scale ="BPS-05";


}


public class Teachers extends Employee{
	double bonus = 1000;
	public static void main(String aa[]){
		Teachers T1 = new Teachers();
		T1.Salary =100000;
		T1.A_inc=T1.Salary*.1;

		System.out.println("Salary: "+T1.Salary);
		System.out.println("A_inc: "+T1.A_inc);
		System.out.println("Bonus: "+T1.bonus);
		
		Peon p1 = new Peon();
		p1.Salary=1000;
		p1.A_inc = p1.Salary*0.1;

		System.out.println("***************PEON***************");

		System.out.println("Salary: "+p1.Salary);
		System.out.println("A_inc: "+p1.A_inc);
		System.out.println("Dress: "+p1.dress);
		System.out.println("Scale: "+p1.scale);








	}

}