
class Puma
{
	void shoes()
	{
		System.out.println("shoes");
	}
}
class Amazon 
{
	public static void main(String[] args) 
	{
		Puma p1=new Puma();
		p1.shoes();

		Customer.product(p1);
	}
}

class Customer
{
	static void product(Puma p2){
		p2.shoes();
		}
}
