package arraysPrograms;

public class Array00 
{
	public static void main(String[] args)
	{
	int[] a=new int[6]; // array syntax
	// array input initialising with syntax
	a[0]=238;
	a[1]=235;
	a[3]=7;
	a[2]='u';
	a[4] = 1234;
	
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}

	// printing output
	/**System.out.println(a[3]);
	System.out.println(a[2]);
	System.out.println(a[1]);
	System.out.println(a[0]);
	System.out.println(a[4]);
	*/
	}


}