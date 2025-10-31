class Overload2

{
	static void send(int no)
	{
		System.out.println(no);
	}
	static void send(String txt)
	{
		System.out.println(txt);
	}
	static void send(int no,String txt)
	{
		System.out.println(no+" "+txt);
	}
	static void send(String txt,int no)
	{
		System.out.println(txt+" "+no);
	}
	public static void main(String[] args) 
	{
		
		send(10);
		send("hiii");
		send(10,"hiii");
		send("hiii",10);
	}
}

