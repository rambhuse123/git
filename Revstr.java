package string1;

public class Revstr {
	 
	String revStr(String str)
	{  
		if(str.isEmpty())
			return str;
		System.out.print(str.charAt(str.length()-1));
		return revStr(str.substring(0,str.length()-1));
		
		
		
		
		
	}
	public static void main(String[] args) {
		Revstr r=new Revstr();
	r.revStr("Hello");
	//System.out.println(s);
		
		
	}

}
