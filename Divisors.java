/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		if (num == 0) {
			System.out.println("Every non-zero numbers is a divisor of 0");
		} else { 
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
				System.out.println(i);
				}
			}
		}		
	}
}
