class Sample
{
	int a=10;
}
class Demo extends Sample
{
	int b=20;
}
class Test extends Demo
{
	int c=30;
}
class Demo1 extends Sample
{
	int d=40;
}
class Hybrid 
{
	public static void main(String[] args) 
	{
		System.out.println("single level");
		Demo d1=new Demo();
		System.out.println(d1.a+d1.b);
		System.out.println("multi level");
		Test t1=new Test();
		System.out.println(t1.a+t1.b+t1.c);
		System.out.println("hirarchical inheritance");
		Demo1 d2=new Demo1();
		System.out.println(d1.a+d1.b);
		System.out.println(d2.a+d2.d);

	}
}
