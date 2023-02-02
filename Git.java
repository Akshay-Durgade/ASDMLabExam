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
            case 2:
				int m1=20;
				boolean flag=true;
				for(int i=2;i<=m1;i++)
				{
					flag=false;
					if(i==2)
						System.out.print(i+",");
					else
					{
						for(int j=2;j<i;j++)
						{
							if(i%j==0)
								flag=true;
						}
						if(!flag)
							System.out.print(i+",");
					}
				}
			break;
            case 3:
			{
				int num=372;
				int originalnumber=num;
				int remainder;
				int result=0;
				while(originalnumber!=0)
				{
					remainder=originalnumber%10;
					result=result+(int)Math.pow(remainder, 3);
					originalnumber=originalnumber/10;
				}
				if(result==num)
				{
					System.out.println("Armstrong");
				}
				else
				{
					System.out.println("Not an Armstrong");
				}
			}
		}
    }
}