public class Array{
	public static void main(String[] args){
	
	int [][]A = new int[2][2];
	A[0][0] = 1;
	A[0][1] = 2;
	A[1][0] = 3;
	A[1][1] = 4;
	
	for(int i=0; i<A.length; i++)
	{
		for(int j = 0; j<A[i].length;j++)
		{
			System.out.println(A[i][j] + " ");
		}
		System.out.println("\n");
	}
}
}