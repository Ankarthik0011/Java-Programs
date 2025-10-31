class Sample
{
	static void add(){
		int a=10;
		System.out.println(a+a);
	}
	void sub(){
	int a=30;
	int b=20;
	System.out.println(a-b);
	}
}
class Demo extends Sample
{
	//static void add();
	//void sub();
}
class Exa 
{
	public static void main(String[] args) 
	{
		Demo.add();   
		Demo d1=new Demo();
		d1.sub();
	}
}
