/**
 * ############################## Pg0902 ##############################
 * 
 */
public class SquareRoot {
	
	/**
	 * This methode use the babylonian methode
	 * https://en.wikipedia.org/wiki/Methods_of_computing_square_roots
	 * @param number integer number
	 * @return integer answer
	 * @throws NegativeNumberException 
	 */
	public int intSqrt(int number) throws NegativeNumberException {
		if (number < 0) {
			throw new NegativeNumberException();
		} else if (number == 0) {
			return 0;	//this is to avoid division by zero in the while loop
		}
		
		//operations must be done in long type to be able to process very big 
		//	32 bit integer correctly
		long answer = number;
		
		while (!(answer*answer <= number && (answer+1)*(answer+1) > number)) {
			answer = (answer + number/answer)/2;
		}
		
		return (int)answer;
	}
	
	public void intArraySqrt(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			try {
				int answer = this.intSqrt(numbers[i]);
				System.out.println("Index " + i + ", Zahl " + numbers[i] + 
						", ganzzahlige Quadratwurtzel ist " + answer);
				
			} catch (NegativeNumberException e) {
				System.out.println("Index " + i + ", Zahl " + numbers[i] + 
						", Quadratwurtzel nicht definiert");
				
			}
		}
	}
}