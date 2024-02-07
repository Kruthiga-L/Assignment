package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=100,primeNum=0;
		for (int j = 2; j < i; j++) {
			if(i%j==0)
			{
				primeNum=1;
				break;
			}
			else
			{
				primeNum=0;
			}
		}
			if(primeNum==1)
			{
				System.out.println("The number is not prime number :"+i);
			}
			else
			{
				System.out.println("The number is a prime number :"+i);
			}
		}
	}
