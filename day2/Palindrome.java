package week1.day2;

public class Palindrome {
	public static void main(String[] args) {
		int p=121,rem=0,t=0;
		for (int i =p ; i > 0; ) {
			t=i%10;
			rem=rem*10+t;
			i=i/10;
			t=0;
		}
		if(p==rem)
		{
			System.out.println("The given number is palindrome :"+p);
		}
		else
		{
			System.out.println("The given number is not palindrome :"+p);
		}
}
}
