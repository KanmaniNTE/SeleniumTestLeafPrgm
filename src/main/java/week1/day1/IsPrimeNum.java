package week1.day1;

public class IsPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=19;
for (int i = 2; i <=num-1; i++) {
	if(num%i !=0)
	{
		System.out.println("The number is a Prime Number");
	}
	else if (num%i ==0)
	{
		System.out.println("The number is not a Prime Number");
	}
	break;
}
	}

}
