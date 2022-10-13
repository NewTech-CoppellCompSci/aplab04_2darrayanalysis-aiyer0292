package lab;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public int[][] createRandom(int row, int column, int min, int max){
		int[][] arr = new int[row][column];

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				int scope = max - min;
				int num = (int) (Math.random() * scope + min);
				arr[i][j] = num;
			}
		}
		
		return arr;
	}
	
	
	//#2
	public void printArray(int[][] arr)  {

		for(int[] row : arr){
			for(int x : row){
				System.out.print(x + " ");
			}
			System.out.println();
		}
		
	
	}
	
	
	//#3
	public int sumTotal(int[][] arr) {
		int total = 0;

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				total += arr[i][j];
			}
		}
		
		return total;
	}
	
	
	//#4
	public double average(int[][] arr) {
		double total = sumTotal(arr);
		double div = arr.length * arr[0].length;

		return total / div;
	}
	
	
	//#5
	public int findMin(int[][] arr) {
		int min = arr[0][0];

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(arr[i][j] < min){
					min = arr[i][j];
				}
			}
		}
		
		return min;
	}
	
	
	//#6
	public int findMax(int[][] arr) {
		int max = arr[0][0];

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				if(arr[i][j] > max){
					max = arr[i][j];
				}
			}
		}
		
		return max;
	}
	
	
	//#7
	public int[][] diffArrays(int[][] arr1, int[][] arr2){

		if(arr1.length == arr2.length && arr1[0].length == arr2[0].length){
			int[][] arr = new int[arr1.length][arr1[0].length];

			for(int i = 0; i < arr1.length; i++){
				for(int j = 0; j < arr1[0].length; j++){
					arr[i][j] = arr1[i][j] - arr2[i][j];
				}
			}
			
			return arr;
		}
		
		return null;
	}
	
	
	//#8 Not done!!!!!!!!!
	public static int[][] transposeRow(int[][] arr1, int dist) {
		int[][] other  = new int[arr1.length][arr1[0].length];  //creates the second array

		for  (int row = 0; row < arr1.length - 1; row +=  dist) {  
			other[row+dist] = arr1[row]; //moves the  row  down by distance
		}	
		
		other[0] = arr1[arr1.length - 1]; 

		return other;
	}
	
	
	//#9 
	public long sum3D(int[][][] arr) {
		long total = 0;

		for(int i = 0; i < arr.length - 1; i++){
			total += (long) this.sumTotal(arr[i]);
		}

		return total;
	}
	
	
	//#10 
	public double average3D(int[][][] arr) {
		long total = this.sum3D(arr);
		int num = (arr.length) * (arr[0].length) * (arr[0][0].length);
		
		double avg = (double) total / (double) num;

		System.out.println();
		System.out.println("Bryn likes snu snu");

		return avg;

		
	}
	
	
	
	
	
	
}
