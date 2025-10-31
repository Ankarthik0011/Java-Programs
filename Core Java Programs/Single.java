class Sample
{
	int a=10;
}
class Demo extends Sample
{
	//int a=10;virtually present
	int b=20;
}
class Test extends Demo
{
	//int a=10;
	//int b=20;virtually present
	void add(){
	System.out.println("hiii");
	}
}
class Single 
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		System.out.println(t1.a+t1.b);
		t1.add();
	}
}
