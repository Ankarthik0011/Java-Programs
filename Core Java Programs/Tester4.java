class Tester4 
{
	static{
		System.out.println("i am a static block");
	}
	{
		System.out.println("i am a iib block");
	}
	public static void main(String[] args) 
	{
		System.out.println("*********main starts*********");
		new Tester4();
		new Tester4();
			new Tester4();
		System.out.println("*********main ends*********");
	}
}
