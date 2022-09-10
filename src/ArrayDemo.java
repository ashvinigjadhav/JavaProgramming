

public class ArrayDemo {
	
	
	
	public static void main(String arg[])
	{
		
		int Array[]=new int[5];//allocate memory to array type of array size of
		Array[0]=1;
		
		Array[1]=2;
		Array[2]=3;
		Array[3]=4;
		Array[4]=5;
		//Array[5]=1;  Index 5 out of bounds for length 5
		System.out.println("elment of array :"+Array[0]);
		System.out.println("elment of array :"+Array[1]);
		System.out.println("elment of array :"+Array[2]);
		System.out.println("elment of array :"+Array[3]);
		System.out.println("elment of array :"+Array[4]);
	   // System.out.println("elment of array :"+Array[5]);//Index 5 out of bounds for length 5
		
		// Array[]= {1,2,3,4,5};
		System.out.println("------------------------------\\");
		for(int i=0;i<5;i++)
		{
			System.out.println("elment of array :"+Array[i]);
		}
		
		
		
		int[] a,d,c; //what are type of a ,d,c 
		//ans:a--array d--->int array  c--->int array
		
		int b[],e,f;////what are type of b ,e,f 
		//ans:b-->int array e-->int  f--->int
		
		
		//2nd way declaration and initialization in one statement 
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		System.out.println("------------------------------\\");
		for(int i=0;i<10;i++)
		{
			System.out.println("elment of array :"+arr[i]);
		}
		
		// how to create array of object 
		
		
		Student s=new Student(2,90,"nitin");
		
		s.marks= 67;
		s.name="rahul";
		s.rollno=1;
		System.out.println("Student s:"+s.rollno+"| "+s.marks+" |"+s.name+" |");
		
		Student s1=new Student();
		
		s1.marks= 67;
		s1.name="rahul";
		s1.rollno=1;
		
		System.out.println("Student s1:"+s.rollno+"| "+s1.marks+" |"+s1.name+" |");
		
		
		
		Student[] coreSy=new Student[5];
		
		//allocate memory to first element in array
		coreSy[0]=new Student(1,95,"ram");
		coreSy[1]=new Student(2,85,"shyam");
		
		System.out.println("Student 1:"+coreSy[0].rollno+"| "+coreSy[0].marks+" |"+coreSy[0].name+" |");
	
	    System.out.println("Student 2:"+coreSy[1].rollno+"| "+coreSy[1].marks+" |"+coreSy[1].name+" |");			
	 	
	
		
		//2d array
	    
	   //array for selenium 2d array data provider
	    
	  System.out.println("---------------2d array-----------------");
	    
	    String[][] studentdata=new String[][]{{"1","95","ram"},{"1","95","ram"},{"1","95","ram"}};
	    
	    System.out.println("StudentData "+studentdata[0][0]+" "+studentdata[0][1]+"  "+studentdata[0][2]);
	    
		
 String[][] logininfodata=new String[3][3];
 logininfodata=getLoginData();
	    
	    System.out.println("logininfodata   "+logininfodata[0][0]+" "+logininfodata[0][1]+"  "+logininfodata[0][2]);
	    
		
	
		
	}

	public static  String[][] getLoginData(){
    	String loginData[][]={{"Admin","admin123","Welcome Admin"},
    					{"Adm", "admin123","Welcome Adm"},
    					{"ESS", "admin123","Welcome ESS"}
    					};
    			return loginData;
    	}
	
	

}
