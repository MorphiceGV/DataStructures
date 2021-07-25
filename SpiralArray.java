package lab0;

/**
 * This is to print 2D square array in Spiral Order
 * 
 * @author Erick Garcia Vargas
 * Formated version of code
 */
public class SpiralArray {
	/*
	 * This function is to print the surrounding elements of the 2D array in
	 * anti-clock order
	 * 
	 * @param arr - 2D array
	 * 
	 * @return String - the spiral order of surrounding elements of the 2D array
	 * (numbers should be separated by single space)
	 */
	public static String printSurSprialArray(int[][] arr) {
		// print surrounding element of the array as a string

//prints outer first column 
		String str = "";
		int layer = 0;

		for (int i = layer; i < arr.length - layer; i++) {
			str += arr[i][0] + " ";

		}
//prints outer last row
		for (int i = layer + 1; i < arr[arr.length - 1 - layer].length - layer; i++) {
			str += arr[arr.length - 1 - layer][i] + " ";

		}
//prints Outer last column 
		for (int i = arr.length - 2 - layer; i > layer; i--) {
			str += arr[i][arr.length - 1 - layer] + " ";

		}
//prints outer first row 

		for (int i = arr.length - 1 - layer; i > layer; i--) {
			str += arr[layer][i] + " ";
		}
		return str.trim();
	}

	/**
	 * This function is to print a 2D n x n square array in anti-clock Spiral oder
	 * 
	 * @param arr - 2D array
	 * @return String - the spiral order of arr (numbers should be separated by
	 *         single space)
	 */
	public static String printSprialArray(int[][] arr) { // return the inside of the array
		String str = "";

		for (int layer = 0; layer <= arr.length / 2; layer++) {
// prints inner column
			for (int i = layer; i < arr.length - layer; i++) {
				str += arr[i][layer] + " ";

			}
// prints inner last row
			for (int i = layer + 1; i < arr[arr.length - 1 - layer].length - layer; i++) {
				str += arr[arr.length - 1 - layer][i] + " ";

			}
// prints inner last column
			for (int i = arr.length - 2 - layer; i > layer; i--) {
				str += arr[i][arr.length - 1 - layer] + " ";

			}
// prints inner first row
			for (int i = arr.length - 1 - layer; i > layer; i--) {
				str += arr[layer][i] + " ";
			}

		}
		System.out.println(str);
		return str.trim();

	}

}
