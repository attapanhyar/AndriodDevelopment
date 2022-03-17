public class learnArray{
	public static void main(String aa[]){
	int size = 3;
	int myArr[]= new int[size];

	myArr[0] = 9;
	myArr[1] = 13;
	myArr[2] = 17;
	int sum = 0;	

	for(int i=0;i<myArr.length;i++){
	sum =sum+myArr[i];
	}	
	System.out.println("The sum of all elements is: "+sum);
}
}