/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String input = args[0];
		int len = input.length();
		for (int i = (len - 1); i >= 0; i--) {
			char c = input.charAt(i);
			System.out.print(c);
		}
		System.out.println();
		if (len % 2 == 0 ){
			System.out.println("The middle character is " + input.charAt((len / 2) - 1));
		} else {
			System.out.println("The middle character is " + input.charAt(len / 2));
		}
	}
}