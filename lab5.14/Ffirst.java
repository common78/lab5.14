package Ffirst;

import java.util.Scanner;

public class Ffirst {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String scan1, scan2, scan3, scan4, scan5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first word:");
        scan1 = scanner.nextLine();

        System.out.println("Enter the second word:");
        scan2 = scanner.nextLine();

        System.out.println("Enter the third word:");
        scan3 = scanner.nextLine();

        System.out.println("Enter the fourth word:");
        scan4 = scanner.nextLine();

        System.out.println("Enter the fifh word:");
        scan5 = scanner.nextLine();

        System.out.println(scan1.concat(" " + scan2).concat(" " + scan3).concat(" " + scan4).concat(" " + scan5));

	}

}
