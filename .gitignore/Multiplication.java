package iit.du.ac.bd;

public class Multiplication {

	public void multiplicationTable(int num){
		int a,b;
		for(a=1;a<11;a++)
        {
           int c = num*a;
           System.out.printf("%d*%d = %d \n",num,a,c);
        }
	}
}
