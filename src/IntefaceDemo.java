interface A{
	int a=10;
	public void showA();
	
	
}
interface B{
	int b=20;
	public abstract void showB();
	
}

abstract class D implements A
{
	public abstract void showD();
	
}


  class E extends D implements A
{
	//public   void showE();

	@Override
	public void showA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showD() {
		// TODO Auto-generated method stub
		
	}
	
}
  
  
   class F extends E implements B 
  {
  	public  void showF() {
  		
  	}

	@Override
	public void showB() {
		// TODO Auto-generated method stub
		
	}
  	
  }


class C implements A,B
{

	@Override
	public void showB() {
		// TODO Auto-generated method stub
		System.out.println("I am in interface B my var is b="+b);
	}

	@Override
	public void showA() {
		// TODO Auto-generated method stub
		System.out.println("I am in interface A my varis a="+a);
	}
	
}

public class IntefaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C objC=new C();
		objC.showA();
		objC.showB();

	}

}
