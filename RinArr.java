import java.util.Scanner;
public class RinArr{
	public static void main(String aa[]){
	Scanner obj = new Scanner(System.in);

	int StdEngM[] = new int[5];

	for(int i=0;i<StdEngM.length;i++){
		StdEngM[i] = obj.nextInt();
}

	for (int j = 0; j<StdEngM.length;j++){
		System.out.println((j+1)+" "+ StdEngM[j]);
}

}

}