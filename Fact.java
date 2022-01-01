package RE;

public class Fact {
	int findFa(int n)
	{
		if(n==1)
			return 1;
		
		return n*findFa(n-1);
		
	}
	public static void main(String[] args) {
		Fact f=new Fact();
		System.out.println("factorial of 5 is"+f.findFa(5));
	}

}
