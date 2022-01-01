package homework;

import java.util.Scanner;

public class Amstrongno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int a=sc.nextInt();
		
		int n=a;
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rev+rem*rem*rem;
			n=n/10;
		}
		if(rev==a)
		System.out.println("Amstrong  no"+a);
		
		else
		System.out.println(a);
		
	}

}
