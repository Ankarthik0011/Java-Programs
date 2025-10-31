class Circle2 
{
	double area(){
		double pi=3.142;
		int r=5;
		double res=pi*r*r;
		return res;


	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Circle2 c1=new Circle2();
		double a=c1.area();
		System.out.println(a);
	}
}
