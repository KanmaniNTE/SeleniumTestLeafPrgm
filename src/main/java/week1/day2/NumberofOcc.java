package week1.day2;

public class NumberofOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "Assistants";
		char ch = 's';
		int occurrence =0;
		char[] charArray= text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]==ch) {
				occurrence++;
			}

		}
		System.out.println("The number of occurence of char is " +occurrence);
	}

}
