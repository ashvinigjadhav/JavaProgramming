/*

class A{
private int a=10;
A(){
	//System.out.println("I am in class A A() constructor");	
}
public void showA()
{
System.out.println("I am in class A my varis a="+a);	
}
}

class B extends A{
protected int b=20;
B(){
	System.out.println("I am in class B B() constructor");	
}
public void showB()
{
	System.out.println("I am in class B my varis b="+b);	
}
}


class C extends B{
int C=30;
C(){
	System.out.println("I am in class C C() constructor");	
}
public void showC()
{
	System.out.println("I am in class C my varis C="+C);	
}
}



public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		C objc=new C();
		//objc.a=1000;//a is private var
		objc.b=2000;
		objc.C=3000;
		objc.showA();
		objc.showB();
		objc.showC();
		
	}

}
*/