package bd.ac.du.iit;

public class FindPrime {
	public static void main(String args[]) {
		int num;
		boolean isPrime = true;
		num = 13;
		for(int i=2; i <= num/i; i++) {
		if((num % i) == 0) {
		isPrime = false;
		break;
		}
		}
		if(isPrime) System.out.println("Prime");
		else System.out.println("Not Prime");
	}

}
