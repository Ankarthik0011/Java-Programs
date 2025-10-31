class Overload1

{
	void send(int no)
	{
		System.out.println(no);
	}
	void send(String txt)
	{
		System.out.println(txt);
	}
	void send(int no,String txt)
	{
		System.out.println(no+" "+txt);
	}
	void send(String txt,int no)
	{
		System.out.println(txt+" "+no);
	}
	public static void main(String[] args) 
	{
		Overload1 l2=new Overload1();
		l2.send(10);
		l2.send("hiii");
		l2.send(10,"hiii");
		l2.send("hiii",10);
	}
}
