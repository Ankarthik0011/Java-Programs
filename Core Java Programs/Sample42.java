abstract class Test
{
	abstract void disp();
	abstract void mul();
}
abstract class Imp extends Test
{
	//abstract void disp();
	//abstract void mul();
	void disp(){
		System.out.println("hiii jspider");
	}

}
class Remo extends Imp
{
	//void disp(){}
	//abstract void mul();
	void mul(){
	System.out.println("bye jspider");
	}
}
class Sample42 
{
	public static void main(String[] args) 
	{
		Remo r1=new Remo();
		r1.disp();
		r1.mul();
	}
}
