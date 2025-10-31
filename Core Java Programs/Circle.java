class Circle
{
	void area(){
		double pi=3.142;
		int r=5;
		double res=pi*r*r;
		System.out.println(res);


	}

	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		c1.area();
		c1.area();
		c1.area();
		
	}
}
