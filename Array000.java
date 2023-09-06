package arraysPrograms;
import java.util.Scanner;
public class Array000 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		int[] ch=new int[size];
		//double[] d= new double[size];
		//String[] d=new String[size];
		//char[] ch=new char[size];
		 //boolean[] ch=new boolean[size];
		
		
		System.out.println("enter array elements");
		for(int i=0;i<=ch.length-1;i++)
		{
			//d[i]=sc.next();
			//ch[i]=sc.next().charAt(0);
		    ch[i]=sc.nextInt();
		}
		
		int sum=0;
		System.out.println("the elements are");
		// reversing for(int i=ch.length-1; i>=0; i--)
		for(int i=0;i<=ch.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(ch[i]);
			}
		}
			System.out.println("the sum is:-"+sum);
		
	}

}











rgfhrbdasfggdfsryutyr