class Tester3 
{
	int id;
	String name;
	Tester3(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Tester3 t1=new Tester3(100,"darshan");
		System.out.println(t1.id);
		System.out.println(t1.name);

	}
}
