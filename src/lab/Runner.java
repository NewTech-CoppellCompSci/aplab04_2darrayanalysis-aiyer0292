package lab;

public class Runner {

	public static void main(String[] args) {
		
		ArrayAnalysis analysis = new ArrayAnalysis();
		
		int[][] arr1 = analysis.createRandom(4, 8, -2, 10);
		int[][] arr2 = analysis.createRandom(4, 8, -4, 9);

		analysis.printArray(arr1);
		System.out.println();
		analysis.printArray(arr2);
		System.out.println();
		System.out.println();
		System.out.println(analysis.sumTotal(arr1));
		System.out.println();
		System.out.println(analysis.average(arr1));
		System.out.println();
		System.out.println(analysis.findMin(arr1));
		System.out.println();
		System.out.println(analysis.findMax(arr1));
		System.out.println();
		analysis.printArray(analysis.diffArrays(arr1, arr2));

		System.out.println();
		System.out.println();

		analysis.transposeRow(arr1, 25);
		analysis.printArray(arr1);




		//analysis is the name of the ArrayAnalysis object
	int[][][] arr3D = new int[3][4][5];
	for (int i = 0; i < arr3D.length; i++) {
		arr3D[i] = analysis.createRandom(4, 5, -40, 40);
	}
	int x = 1;
	for (int[][] arr : arr3D) {
		System.out.println("\nLayer #" + x);
		analysis.printArray(arr);
		x++;
	}

		
	}
	
	
	
	
	
	
	
}
