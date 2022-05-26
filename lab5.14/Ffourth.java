package Ffourth;

import java.util.Locale;
import java.util.Scanner;

public class Ffourth {

	public static void main(String[] args) {
		String firstName, secondName;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter the second name:");
        secondName = scanner.nextLine();

        boolean ident = firstName.toLowerCase().equals(secondName.toLowerCase());
        if(ident == true){
            System.out.println("The names are identical");
        }
        else{
            System.out.println("The names are not identical");
        }

	}

}
