import java.util.*;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("eneter n");
		int m=sc.nextInt();
		int n=m;
		int temp=0;
		while (n>0)
		{
			int r=n%10;
			temp=temp*10+r;
			n=n/10;
		}
		System.out.println(temp);
		if (temp==m)
		{
			System.out.println(m+"the number is palindrome"+temp);
		}
		else
			System.out.println(m+" is not a palindrome"+temp);
	}
}
