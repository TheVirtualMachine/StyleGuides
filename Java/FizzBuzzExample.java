/****************************************
 * Copyright Notice (Optional)
 ***************************************/

/**
 * An example FizzBuzz program.
 * <a href="https://en.wikipedia.org/wiki/Fizz_buzz">Wikipedia on FizzBuzz.</a>
 * <p>
 * This program demonstrates proper syntax and Javadoc style.
 * 
 * <h2>Course Info:</h2>
 * Course Code with Teacher Name
 * 
 * @version Version of the program.
 * @author Your name
 */
public class FizzBuzzExample {

	/** How high to count to. */
	private int counterEnd;

	/**
	 * {@link FizzBuzzExample} constructor.
	 * Sets the values of {@link #counterStart} and {@link #counterEnd}.
	 * 
	 * @param endNumber How high to count to.
	 */
	public FizzBuzzExample(int endNumber) {
		this.counterEnd = endNumber;
	}

	/**
	 * Runs the FizzBuzz program.
	 * 
	 * @throws Exception Demonstration of using throws.
	 */
	private void fizzBuzz() throws Exception {
		for (int i = 1; i <= counterEnd; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	/**
	 * The entry point to the program.
	 * 
	 * @param args The arguments passed from the command line.
	 */
	public static void main(String[] args) {
		FizzBuzzExample e = new FizzBuzzExample(30);
		try {
			e.fizzBuzz();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

}