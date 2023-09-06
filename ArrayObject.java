package arraysPrograms;

class Car
{
   public String cName;
   public int cNum;
   String model;
   public Car(String cName,int cNum,String model)
   {
	   this.cName=cName;
	   this.cNum=cNum;
	   this.model=model;
   }
}

public class ArrayObject 
{
	public static void main(String[] args) 
	{
	  Car[] cr=new Car[2]; // car Array object
	  cr[0]=new Car("audi", 112,"vx2");
	  cr[1]=new Car("audi",3,"gc2");
	  
	  for(int i=0;i<=cr.length-1;i++)
	  {
		  System.out.println(cr[i].cName+" "+ cr[i].cNum+" "+ cr[i].model+" ");
	  }
	  
		
	}

}
