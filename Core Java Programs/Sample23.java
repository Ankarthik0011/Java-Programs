class Sample23 
{
	public static void main(String[] args) 
	{
		/*int[] arr=new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		System.out.println(arr.length);
		System.out.println(arr[0]);
			System.out.println(arr[1]);
				System.out.println(arr[2]);
					System.out.println(arr[3]);
						System.out.println(arr[4]);
						for(int i=0;i<arr.length;i++){
							System.out.println(arr[i]);

						}

						arr[1]=50;
						System.out.println(arr[1]);*/

						int[] arr={10,20,30,40};
						System.out.println("value"+"\t"+"index");
						for(int i=0;i<arr.length;i++){
							
							System.out.println(arr[i]+" \t"+i);

						}
						System.out.println("------------------------------------------");

						int[] brr=arr;
						for(int i=0;i<brr.length;i++){

								System.out.println(brr[i]);

						}
			
		}
}
