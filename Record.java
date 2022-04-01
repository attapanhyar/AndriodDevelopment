import java.util.ArrayList;

class Student{
	int id;
	String Fname;
	String Lname;
}

public class Record{
	public static void main(String aa[]){

		ArrayList<Student> rcd = new <Student>ArrayList();

		Student s1 = new Student();
		s1.id=1;
		s1.Fname="Shazzy";
		s1.Lname="Mangoo";

		Student s2 = new Student();
		s2.id=2;
		s2.Fname="Shanee";
		s2.Lname="Mangal";
	rcd.add(s2);
	rcd.add(s1);

	for(Student i:rcd){
		System.out.println(i.id);
		System.out.println(i.Fname);
		System.out.println(i.Lname);	
	}


}

}