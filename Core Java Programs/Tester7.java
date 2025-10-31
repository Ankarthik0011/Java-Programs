class Tester7 
{
	static{
		System.out.println("sib1");
	}
		{
		System.out.println("iib1");
	}
	static{
		System.out.println("sib2");
	}
		{
		System.out.println("iib2");
	}
	static{
		System.out.println("sib3");
	}
	Tester7(){
		System.out.println("i am a constructor");
	}
	{
		System.out.println("iib3");
	}
	public static void main(String[] args) 
	{
		System.out.println("**********main starts*********");

			new Tester7();

		System.out.println("**********main ends*********");
	}
}
