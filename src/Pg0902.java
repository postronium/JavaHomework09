/**
 * ############################## Pg0902 ##############################
 * 
 */
public class Pg0902 {

	public static void main(String[] args) {
		SquareRoot squareRoot = new SquareRoot();
		
		//test with max and min values of 32 bit integer to be sure
		//	that the function work with every possible 32 bit integer
		int max32Int = 0x7FFFFFFF;
		int min32Int = max32Int + 1;
		
		int[] numbers = {
				10, max32Int, min32Int, 5, 6, 1000, 
				10000000, -51, 42, -42, 4
		};
		
		squareRoot.intArraySqrt(numbers);
	}
}
