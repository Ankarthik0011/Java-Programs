class Circle1 
{
	void area(int r){
		double pi=3.142;
		double res=pi*r*r;
		System.out.println(res);

	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Circle1 c1=new Circle1();
		c1.area(5);
	}
}
