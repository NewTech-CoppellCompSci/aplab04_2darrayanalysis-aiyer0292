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
		int[][] arr = new int[row][column]; //makes a new 2d array

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){ //cycles through all elements
				int scope = max - min;
				int num = (int) (Math.random() * scope + min); //generates random number within parameters
				arr[i][j] = num;
			}
		}
		
		return arr;
	}
	
	
	//#2
	public void printArray(int[][] arr)  {

		for(int[] row : arr){
			for(int x : row){ //cycles through all elements
				System.out.print(x + " "); //prints each elements
			}
			System.out.println(); //"\n" at the end of every row
		}
		
	
	}
	
	
	//#3
	public int sumTotal(int[][] arr) {
		int total = 0; //initializes sum

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){ //goes through every element
				total += arr[i][j]; //adds each to the sum total
			}
		}
		
		return total;
	}
	
	
	//#4
	public double average(int[][] arr) {
		double total = sumTotal(arr); //sums the array
		double div = arr.length * arr[0].length; //finds the number of elements in total

		return total / div; //divides total by number of elements
	}
	
	
	//#5
	public int findMin(int[][] arr) {
		int min = arr[0][0]; //sets min equal to first 

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){ //cycles through all elements
				if(arr[i][j] < min){
					min = arr[i][j]; //if current value is less than min, change the value of min
				}
			}
		}
		
		return min;
	}
	
	
	//#6
	public int findMax(int[][] arr) { //same thing but with max
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

		if(arr1.length == arr2.length && arr1[0].length == arr2[0].length){ //makes sure they are the same size
			int[][] arr = new int[arr1.length][arr1[0].length]; //makes new array

			for(int i = 0; i < arr1.length; i++){
				for(int j = 0; j < arr1[0].length; j++){ //cycles through all elements
					arr[i][j] = arr1[i][j] - arr2[i][j]; //sets each value to the corresspoinding values difference
				}
			}
			
			return arr;
		}
		
		return null; //returns null if they are not the same size
	}
	
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist) {
		int[][] other  = new int[arr1.length][arr1[0].length];  //creates an array

		for  (int row = 0; row < arr1.length; row +=  dist) {  
			other[row+dist] = arr1[row]; //moves the  row  down by distance
		}	

		other[0] = arr1[arr1.length - 1]; 

		return other; //returns the new array
	}
	
	
	//#9 
	public long sum3D(int[][][] arr) {
		long total = 0;

		for(int i = 0; i < arr.length - 1; i++){
			total += (long) this.sumTotal(arr[i]); //sums each 2d array in the 3d array
		}

		return total;
	}
	
	
	//#10 
	public double average3D(int[][][] arr) {
		long total = this.sum3D(arr); //sums the array
		int num = (arr.length) * (arr[0].length) * (arr[0][0].length); //finds the total # of elements
		
		double avg = (double) total / (double) num; //sum / # of elements

		System.out.println();
		System.out.println("Bryn likes snu snu"); //Bryn likes snu snu

		return avg; //returns the average

		
	}
	
	
	
	
	
	
}
