abstract class Sample
{
	abstract void add();
	abstract void sub();
}
class Demo extends Sample
{
	void add(){
		System.out.println("hiiiii");
	}
	void sub(){
		System.out.println("Bye");
	}
}
class Sample41 
{
	public static void main(String[] args) 
	{
		Demo d1=new Demo();
		d1.add();
		d1.sub();
	}
}
