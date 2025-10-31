class Overload3 
{
	public static void main(int a) 
	{
		System.out.println(a);
	}
	public static void main(String b) 
	{
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		main(10);
		main("hiii");
		main(10,"hii");
	}
	public static void main(int a,String b) 
	{
		System.out.println(a+" "+b);
	}
}
