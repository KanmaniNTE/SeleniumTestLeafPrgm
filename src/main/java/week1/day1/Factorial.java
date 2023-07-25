package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =1;
		int fact =1;
for (int i=1; i<=10; i++)
{
	sum = sum*i;
	

	}
for (int j=6;j>=1;j--)
{
	fact =fact *j;
}
	
System.out.println("Factorial of 10 is :"+sum);
System.out.println("Factorial of 6 is :"+fact);
	}
}
