package co.grandcircus;

import java.util.Scanner;

public class AssessmentReviewA {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int totalDays = 0;
		double numDaysSunny = 0;
		double numDaysRainy = 0;
		int userNum;

		System.out.println("Please enter a number between 1 and 3:");
		userNum = scnr.nextInt();

		while (userNum == 1 || userNum == 2) {

			totalDays++;

			if (userNum == 1) {
				numDaysSunny++;
			}
			if (userNum == 2) {
				numDaysRainy++;
			}

			System.out.println("1. Sunny Day\n2. Rainy Day\n3. Exit\n");
			System.out.println("Please enter a number between 1 and 3: ");
			userNum = scnr.nextInt();

			if (userNum < 0 && userNum > 3) {

				System.out.println("Sorry, I didn't understand. Let's try again.");
				userNum = scnr.nextInt();
			}

			if (userNum == 3) {

				System.out.println("Sunny Day Percentage: " + (numDaysSunny / totalDays) * 100);
				System.out.println("Rainy Day Percentage: " + (numDaysRainy / totalDays) * 100);
				System.out.println("Total Amount of Days Entered: " + totalDays);
			}
		}
		scnr.close();
	}
}