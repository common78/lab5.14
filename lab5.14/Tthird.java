package Tthird;

import java.util.Scanner;

public class Tthird {

	public static void main(String[] args) {
		double num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first fractional number:");
        if(scanner.hasNextDouble()) {
            num1 = scanner.nextDouble();
            System.out.println("Enter the second fractional number:");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                System.out.println("Enter the third number");
                if (scanner.hasNextDouble()) {
                    num3 = scanner.nextDouble();
                    if(num1 > num2 && num1 > num3){
                        System.out.println("The first largest number");
                    }
                    if(num2 > num1 && num2 > num3){
                        System.out.println("The second largest number");
                    }
                    if(num3 > num2 && num3 > num1){
                        System.out.println("The third largest number");
                    }
                    if(num1 > num2 && num1 == num3){
                        System.out.println("The first and third numbers are the largest");
                    }
                    if(num1 > num3 && num1 == num2){
                        System.out.println("The first and second numbers are the largest");
                    }
                    if(num2 > num1 && num2 == num3){
                        System.out.println("The second and third numbers are the largest");
                    }
                    if(num1 == num2 && num2  == num3) {
                        System.out.println("All numbers are equal");
                    }
                } else {
                    System.out.println("All numbers are equal");
                }
            } else {
                System.out.println("Al numbers are echual");
            }
        }
            else {
                System.out.println("Al numbers are echual");
            }

	}

}
