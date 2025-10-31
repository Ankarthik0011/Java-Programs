/* class Sample30
{
public static void main(String[] args){
char ch='c';
double d=1.7d;
switch(d){
case 1.7d:System.out.println("first class");
   break;
case 1.8d:System.out.println("second class");
		 break;
case 1.9d:System.out.println("pass");
		 break;
default:System.out.println("invalid input");

}
}
} */

class Sample30
{
	static void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void sub(){
		int a=30;
		int b=20;
		System.out.println(a-b);
	}
	static void mul(){
		int a=30;
		int b=20;
		System.out.println(a*b);
	}
	 void div(){
		int a=30;
		double b=20.0;
		System.out.println(a/b);
	}
	public static void main(String [] args){
		Sample30 s=new Sample30();
		String str="div";
		switch(str){
			case "add":add();
			break;
			case "sub":sub();
			break;
			case "mul":mul();
			break;
			case "div":s.div();
			break;
			default:System.out.println("invalid input");
		}
	}
}