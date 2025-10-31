class Student
{

	int id;
	String name;
	Student(int a,String b){
		id=a;
		name=b;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Student s1=new Student(100,"tejas");
		System.out.println(s1.id);
		System.out.println(s1.name);
		Student s2=new Student(101,"darshan");
		System.out.println(s2.id);
		System.out.println(s2.name);

	}
}
