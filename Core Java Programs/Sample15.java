class Sample15 
{
	void add(double b){
	int a=10;
	double res=a+b;
	System.out.println(res);
	}
	double area(int r){
	double pi=3.142;
	double res=pi*r*r;
	//System.out.println(res);
	return res;

	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		double a=new Sample15().area(5);
		new Sample15().add(a);

		System.out.println(a);
	}
}
