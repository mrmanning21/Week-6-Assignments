//A quick way to get a cubic amount.
public class SimpleMethod {
	
	public static void main(String[] args) {

		int N = 3;
		int arr[][][] = new int[3][3][3];   
		

		for (int x = 0; x < N; x++)
			for(int y = 0; y < N; y++)
				for(int z = 0; z < N; z++)
					arr[x][y][z] = 1;
		
		for(int x = 0; x < N; x++)
			for(int y = 0; y < N; y++)
				for(int z = 0; z < N; z++)
					
		System.out.println (arr[x][y][z] + " ");
		}   
}