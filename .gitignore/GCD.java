package iit.du.ac.bd;

import java.util.Scanner;

public class GCD {
	public static void main(String args[]){

        //Enter two number whose GCD needs to be calculated.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();

        System.out.println("GCD of two numbers " + number1 +" and " + number2 +" is :" + findGCD(number1,number2));


    }

	static int findGCD(int number1, int number2) {
        if(number2 == 0){
            return number1;
        }
        else
            return findGCD(number2, number1%number2);
    }

}
