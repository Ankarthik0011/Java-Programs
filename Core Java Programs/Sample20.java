class Sample20 
{
	int x=10;
	static void add(Sample20 s2){
		System.out.println(s2.x);
	}
	public static void main(String[] args) 
	{
		Sample20 s1=new Sample20();
		System.out.println(s1.x);
		add(s1);
		sub(s1);
		
	}
	static void sub(Sample20 s3){

	System.out.println(s3.x);
	}
}
