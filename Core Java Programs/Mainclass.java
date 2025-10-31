class Sample13
{
	static int c=50;
	static void add(){
		int a=10;
		int b=20;
		int res=a+b;
		System.out.println(res);

	}
}


class  Mainclass
{
	public static void main(String[] args) 
	{
		Sample13.add();
		System.out.println(Sample13.c);
	}
}
