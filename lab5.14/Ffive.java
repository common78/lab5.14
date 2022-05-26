package Ffive;

import java.util.Scanner;

public class Ffive {

	public static void main(String[] args) {
		String firstLine, secondLine;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first line:");
        firstLine = scanner.nextLine();

        System.out.println("Enter the second line");
        secondLine = scanner.nextLine();

        if (firstLine.length() > secondLine.length()){
            System.out.println("The first line has more characters");
        }
        if (secondLine.length() > firstLine.length()){
            System.out.println("The second line has more characters");
        }
        else{
            System.out.println("The lines are straight");
        }
	}

}
