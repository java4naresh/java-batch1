package training.java;

public class IntegerArray 
{
	public static void main(String[] args)
	{
		int temp;
		int[] a1= {1,5,3,2,4};
		System.out.println("Original array");
		
		for(int i=0;i<=a1.length-1;i++)
		{
			
			System.out.print(a1[i]+"");
		}
		
		/// Ascending Order
		
		for(int i=0;i<=a1.length-1;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]>a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			
			
			}
		}
		
		System.out.println();
		
		
		System.out.println("Given array is Ascending order");
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.print(a1[i]+"");
		}
		
		//Descending Order
		
		for(int i=0;i<=a1.length-1;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]<a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			
			
			}
		}
		
		System.out.println();
		
		
		System.out.println("Given array is Descending order");
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.print(a1[i]+"");
		}
		
	}

}
