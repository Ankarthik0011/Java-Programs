class Wh7 
{
	static int factorial(int no){
		int fact=1;
		for(int i=no;i>=1;i--){
			fact=fact*i;
		}
		//System.out.println(no+" facorial is-->"+fact);
		return fact;
	
	}
	public static void main(String[] args) 
	{
		int sum=0;
		int no=123456;
		while(no!=0){
			int rem=no%10;
			if(rem%2==0){
					sum=sum+factorial(rem);
				}
				no=no/10;
			}
			System.out.println(sum);
	}
}
