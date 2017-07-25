package iit.du.ac.bd;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Multiplication mc = new Multiplication();
		
		System.out.printf("Enter the number:");
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		mc.multiplicationTable(value);
		
	}

}
