class Whatsapp_v1
{
	void send(){
		System.out.println("txt,doc");
	}
}
class Whatsapp_v2 extends Whatsapp_v1
{
	void send(){
		super.send();
		System.out.println("msg,money,video");
	}
}
class OverRiding
{
	public static void main(String[] args) 
	{
		Whatsapp_v2 w1=new Whatsapp_v2();
		w1.send();
	}
}
