class OverLoad 
{
	private void send(int no)
	{
		System.out.println(no);
	}
	static int send(String txt)
	{
		return 1;
	}
	protected double send(int no,String txt)
	{
		return 96.96d;
	}
	public static  boolean send(String txt,int no)
	{
		return true;
	}
	public static void main(String[] args) 
	{
		OverLoad l1=new OverLoad();
		l1.send(10);
		System.out.println(send("hii"));
		System.out.println(l1.send(10,"hii"));
		System.out.println(send("hii",10));

	}
}
