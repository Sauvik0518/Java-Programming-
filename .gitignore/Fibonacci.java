package iit.du.ac.bd;

public class Fibonacci {

	public void fibonacciSeries(int num){
		int a,b,c ;

	    a = 0; b = 1;
	    System.out.printf("%d\n%d\n",a,b);
	    for(int i = 0;i < num;i++ )
	    {
	        c = a + b;
	        System.out.printf("%d\n",c);
	        a = b;
	        b = c;
	    }
	}
}
