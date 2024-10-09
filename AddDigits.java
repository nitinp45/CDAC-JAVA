public class AddDigits
{
	public static void digitSum(int num)
	{	
		int sum=0;
		while(num!=0)
		{
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}	
		System.out.println(sum);	

	}
	public static void main(String[] args)
	{
		if(args.length>0)
		System.out.println("enter something");
		for(int i=0;i<args.length;i++)
		{
			int num=Integer.parseInt(args[i]);
			digitSum(num);

		}	

	}
}		