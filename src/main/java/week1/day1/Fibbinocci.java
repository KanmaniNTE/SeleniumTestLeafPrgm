package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=1;
		int n;
		int k=10;
		System.out.println(i);
		System.out.println(j);
		for (int k2 = 1; k2 < k; k2++) {
			n=i+j;
			i=j;
			j=n;
			System.out.println(n);
		}

	}

}
