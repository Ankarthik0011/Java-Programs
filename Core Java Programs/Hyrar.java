class Sample
{
	int a=10;
}
class Demo extends Sample
{
	//int a=10;
	int b=20;
}
class Test extends Sample
{
	//int a=10;
	int c=30;
}
class Hyrar 
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		System.out.println(d1.a+d1.b);
		Test t1=new Test();
		System.out.println(t1.a+t1.c);
	}
}
