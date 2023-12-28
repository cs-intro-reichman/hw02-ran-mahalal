/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 1;
		String perfect = num + " is a perfect number since " + num + " = 1";
		for(int i = 2; i < num;	 i++) {
			if(num % i == 0) {
				perfect = (perfect + " + " + i);
				sum = (sum + i);
			}
		}
		if (sum == num) {
			System.out.println(perfect);
		} else {
			System.out.println(num + " is not a perfect number");	
		}
	}
}
