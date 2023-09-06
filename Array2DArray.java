package arraysPrograms;
import java.util.Scanner;
public class Array2DArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter the  rows  elements");
		int rows=sc.nextInt();
		System.out.println(" enter the  columns  elements");
		int columns=sc.nextInt();
		int[][] e=new int[rows][columns];
		
		int value=1;
		for(int i=0;i<=rows-1;i++)
		{
			for(int j=0;j<=columns-1;j++)
			{
		
			   e[i][j]=value;
			   value++;
			}
		}
		System.out.println(" enter the 2D array");
		for(int i=0;i<=rows-1;i++)
		{
			for(int j=0;j<=columns-1;j++)
			{
	System.out.print(e[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
