	/**
	 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
	 */
	public class DamkaBoard {
		public static void main(String[] args) {
			int board = Integer.parseInt(args[0]);
			for (int i = 1; i <= board; i++) {
				if ((i % 2) == 0) {
					for (int j = 1; j <= board; j++ ) {
						System.out.print(" *");
					}
				} else {
					for (int j = 1; j <= board; j++ ) {
						System.out.print("* ");
					}
				}
				System.out.println();
			}
		}
	}
