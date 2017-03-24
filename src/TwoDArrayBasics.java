import java.util.Random;

public class TwoDArrayBasics {

	public static void main(String[] args) {
		// Create a 3 x 5 array of ints
		int[][] nums = new int[3][5];
		// Fill the array with random numbers using fillRandom
		fillRandom(nums, 1, 100);
		// test each method you create below.
		
		//prints the array
		printArray(nums);
		
		//finds the sum of each row
		System.out.println("Sum of row 1: " + rowSum(nums, 1));
		
		//finds the sum of all of the rows
		int[] rowsSum = rowsSum(nums);
		System.out.print("Rows sum: ");
		printItems(rowsSum);
		
		//checks if all of the items in a 1d array are unique
		System.out.println("Are unique: " + isUnique(rowsSum));
		
		//finds the index of a value in a 1d array
		System.out.println("Index of " + rowsSum[2] + " sum, " + indexOf(rowsSum, rowsSum[2]));
		
		//finds the minimum value in a 2d array
		System.out.println("Min: " + min(nums));
		
		//finds the maximum value in a 2d array
		System.out.println("Max: " + max(nums));
		
	}
	/*
	 * given the lower and upper bounds of the random numbers
	 * fill an array of random numbers 
	 */
	
	public static void fillRandom(int[][] nums, int low, int high) {
		
		Random rand = new Random();
		
		for (int row = 0; row < nums.length; row++) {
			
			for (int column = 0; column < nums[0].length; column++) {
				
				nums[row][column] = rand.nextInt(high) + low;
				
			}
			
		}
		
	}
	
	/*
	 * create a method that prints a 2D array
	 */
	public static void printArray(int[][] nums) {
		
		for (int r = 0; r < nums.length; r++) {
			System.out.print("{\t");
			for (int c = 0; c < nums[0].length; c++) {
				
				System.out.print(nums[r][c] + "\t");
				
			}
			System.out.println("}");
		}
		
	}
	
	/*
	 * return the sum of a row (r) in a 2D array (nums)
	 */
	
	public static int rowSum(int[][] nums, int row) {
		
		int sum = 0;
		for (int r = 0; r < nums[0].length; r++) {
			
//			System.out.println(nums[row][r]);
			sum += nums[row][r];
			
		}
		return sum;
		
	}
	
	/*
	 * return an array of row sums of a 2D array (nums)
	 */
	
	public static int[] rowsSum(int[][] nums) {
		
		int[] rowSums = new int[nums.length];
		int sum = 0;
		for (int r = 0; r < nums.length; r++) {
			
			rowSums[r] = rowSum(nums, r);
			
		}
		return rowSums;
		
	}
	
	//prints the items in a 1d array
	public static void printItems(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + ", ");
			
		}
		System.out.println();
		
	}
	
	
	/*
	 * check an 1D array for repeats, return true if all 
	 * elements of the array are unique
	 */
	
	public static boolean isUnique(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i - 1; j > 0; j--) {
				if (array[i] == array[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	
	/*
	 * given an array
	 * return the index of the target value, 
	 * return -1 if it is not found
	 */
	
	public static int indexOf(int[] array, int value) {
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] == value) {
				return i;
			}
			
		}
		return -1;
		
	}
	
	
	/*
	 * return the min value in a 2D array
	 */
	
	public static int min(int[][] array) {
		
		int min = array[0][0];
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[0].length; c++) {
				if (array[r][c] < min) {
					min = array[r][c];
				}
			}
		}
		return min;
		
	}
	
	
	
	/*
	 * return the max value in a 2D array
	 */
	
	public static int max(int[][] array) {
		
		int max = array[0][0];
		for (int r = 0; r < array.length; r++) {
			for (int c = 0; c < array[0].length; c++) {
				if (array[r][c] > max) {
					max = array[r][c];
				}
			}
		}
		return max;
		
	}
	
	
	
}
