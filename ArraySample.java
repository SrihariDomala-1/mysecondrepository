package arraysPrograms;
import java.util.Scanner;
public class ArraySample 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter elements");
	     int v=sc.nextInt();
	     int[] a=new int[4];
		//a[1]=12;
		//a[3]=23;
		//a[2]=78;
		//a[4]=89;
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
}

}
