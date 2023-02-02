class Git
{
    public static void main(String args[]) 
    {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice\n1.)Fibonacci Series\n2.)Prime Numbers\n3.)Armstrong Number");
		int n=sc.nextInt();
		
		switch(n)
		{
			case 1:
				int n1=20;
				int first=0;
				int second=1;
				for(int i=1;i<=n1;i++)
				{
					System.out.print(first+", ");
					int third=first+second;
					first=second;
					second=third;
				}
			break;
		}
    }
}