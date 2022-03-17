import java .util .Scanner;
public class percentArr{

  public static void main(String argds[]){

    Scanner obj = new Scanner(System.in);

   String name[] = new String[6];
    int Eng[] = new int [5];
    int Math[]= new int [5];
    int Bio[] = new int [5]; 
    int i=0;

  System.out.println("Enter name of 5  students");
    for(i = 0; i<5; i++){
   name[i] = obj.nextLine();
}

    System.out.println("Enter English marks of 5 students");
    for(i = 0; i<5; i++){
     Eng[i] = obj.nextInt();
}

   System.out.println("Enter Math marks of 5 students");
    for(i = 0; i<5; i++){
     Math[i] = obj.nextInt();
}
  
System.out.println("Enter Biology marks of 5 students");
    for(i = 0; i<5; i++){
     Bio[i] = obj.nextInt();
}

    //displaying names
    for(i = 0; i<5; i++){
 System.out.println(name[i]);
}

    
   int per[] = new int[5];

  for(i = 0; i<5; i++){
     per[i] = (Eng[i] + Math[i] + Bio[5])*100/300;
}

     System.out.println("Percntage of students are:");

   for(i = 0; i<5; i++){
    System.out.println(per[i]);
}


 }
}