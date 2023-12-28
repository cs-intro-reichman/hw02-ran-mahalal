import java.util.Random;
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
       
        int two_children = 0;
		int three_children = 0;
		int four_or_more = 0;
		int total_sum = 0;
		for (int i = 0; i < T; i++) {
			int count_boy = 0;
			int count_girl = 0;
			do {
				// Generates a random number between 0 to 1, that determines the gender of the child
				double random = generator.nextDouble();
				
				boolean girl = (random < 0.5);		
				if (girl) {
					total_sum++;
					count_girl++;
				} else {
					total_sum++;
					count_boy++;
				} 
			} while ((count_girl < 1) || (count_boy < 1));

			// Determines the number of children in each family and updates the counts accordingly
			if (count_girl + count_boy == 2) {
				two_children++;
			} else if (count_girl + count_boy == 3) {
				three_children++;
			} else {
				four_or_more++;
			}
			
		}

		 // Determines the most common number of children in a family	
		String most_common = "";
		if ((two_children >= three_children) && (two_children >= four_or_more)) {
			most_common = "2";
		} else if ((three_children > two_children) && (three_children >= four_or_more)) {
			most_common = "3";
		} else {
			most_common = "4 or more";
		}
		double average = ((double) (total_sum) / T);

		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + two_children);
		System.out.println("Number of families with 3 children: " + three_children);
		System.out.println("Number of families with 4 or more children: " + four_or_more);
		System.out.println("The most common number of children is " + most_common + ".");
	}
}

