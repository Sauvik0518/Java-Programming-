package iit.du.ac.bd;

import java.util.Scanner;

public class FibonacciMain {
	public void main(String[] args){
		Fibonacci fb = new Fibonacci();
		
		System.out.println("Enter the value,how far you want to see fibonacci numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		fb.fibonacciSeries(value);
		
	}

}
