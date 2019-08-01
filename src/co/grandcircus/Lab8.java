package co.grandcircus;

import java.util.Scanner;

public class Lab8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] studentName = { "Jamaal", "Malikah", "Penny", "Camron", "Jocelyn", "Phyllis", "Suzanna", "Owain",
				"Joanna", "Zackery" };
		String[] hometown = { "Baton Rouge, LA", "Tucson, AZ", "Columbus, OH", "Omaha, NE", "Newark, NJ",
				"Long Beach, CA", "El Paso, TX", "Lincoln, NE", "Aurora, CO", "Portland, OR" };
		String[] favoriteFood = { "pizza", "sushi", "tacos", "fried chicken", "steak", "ramen", "pasta", "fried rice",
				"rice cakes", "burgers" };
		System.out.println("Welcome to our Java class.");

		for (int i = 0; i < studentName.length; i++) {
			System.out.println((i + 1) + "." + studentName[i] + "");

		}
		boolean check = false;
		// boolean to check it the user inputs the correct input
		do {
			System.out.println("Which student would you like to learn more about? (enter a number 1-10): ");
			int studentNum = scan.nextInt();
			int index = studentNum - 1;

			try {
				System.out.println("Student " + studentNum + " is " + studentName[index] + ".");
				check = true;

			} catch (ArrayIndexOutOfBoundsException ex) {
				scan.nextLine();
				System.out.println("That student does not exist. Please try again. (enter a number 1-10): ");
				check = false;
				continue;
			}
			scan.nextLine();

			String more = "yes";
			// while loop to continue if they select yes, and the output either hometown or favorite food
			//when the while continue
			while (more.equalsIgnoreCase("yes")) {
				System.out.println("What would you like to know about " + studentName[index]
						+ "? (enter \"hometown\" or \"favorite food\"): ");
				String nextChoice = scan.nextLine();
				int check1 = 0;
				do {
				if (nextChoice.equalsIgnoreCase("hometown")) {
					System.out.println(studentName[index] + " is from " + hometown[index] + ".");
				} else if (nextChoice.equalsIgnoreCase("favorite food")) {
					System.out.println(studentName[index] + " favorite food is " + favoriteFood[index] + ".");
				} else {
					System.out.println(
							"That data does not exist. Please try again. (enter \"hometown\" or \"favorite food\" or \"exit\": ");
					more = scan.nextLine();
						if(more.startsWith("e"));
						System.out.println("Goodbye!");
					break;
				}
				

				
					System.out.println("Would you like to know more? (enter\"yes\" or \"no\"): ");
					more = scan.nextLine();

					if (more.equalsIgnoreCase("yes")) {
						check1 = 1;

					} else if (more.equalsIgnoreCase("no")) {
						check1 = 1;
						System.out.println("Thanks!");
						continue;

					} else if (!more.equalsIgnoreCase("yes") || (!more.equalsIgnoreCase("no"))) {
						System.out.println("Incorrect input! Please enter \"yes\" or \"no\"): ");
						continue;
					}else {
						
					}

				} while (check1 != 1);

			}
		} while (!check);
		scan.close();
	}
}
