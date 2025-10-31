class Sample17 
{

	double area(){
	
	double pi=3.142;
	int r=5;
	double res=pi*r*r;
	return res;
	
	}
	public static void main(String[] args) 
	{
		double a=new Sample17().area();
		System.out.println(a);
	}
}
