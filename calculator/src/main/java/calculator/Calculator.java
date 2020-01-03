package calculator;

/**
 * @author Alvi
 *
 */
public class Calculator {
	
	 
	/**
	 * @param num1 the first integer
	 * @param num2 the second integer
	 * @param num3 the third integer
	 * @return maximum integer
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	 
	/**
	 * @param num is input value 
	 * @return the square of the input integer
	 * @throws IllegalArgumentException when the input integer is not 
       * between  0 and 10
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
			result = num * num;
		} else
			throw new IllegalArgumentException();
		return result;
	}
 
	/**
	 * @param  num input integer
	 * @return the cube of the input integer
	 */
	public int cube(int num){
		return num*num*num;
	}

}