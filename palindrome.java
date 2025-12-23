import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=s.nextInt();
		int rev=0;
		int temp=num;
		while(temp>0) {
			int remainder=temp%10;
			rev=rev*10+remainder;
			temp=temp/10;
			
		}
		if (num==rev) {
			System.out.println("it is a palindrome");
		}else
			System.out.println("it is not a palindrome");
	}

}
