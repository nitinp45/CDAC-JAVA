class PrimeNumber{
	public static boolean isPrime(int n)
	{
		 for(int i=2;i<n;i++)
		  {
			if(n%i==0)
			{
				return false;
			}
		}
	return true;
	}
	public static void main(String[] args)
	{	
		int sum=0;
		if(args.length==0)
			System.out.println("Enter something");
		for(int i=0;i<args.length;i++)
		{
			int num=Integer.parseInt(args[i]);
			if(isPrime(num))
			{
				sum+=num;
			}
		}
	System.out.println("Sum is:"+sum);
	}
}