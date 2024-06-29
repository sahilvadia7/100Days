package Modifiers;

abstract class Main {
	int a,b,c;
	
	Main(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public abstract void printD();
}

class A extends Main{

	A(int a, int b, int c) {
		super(a, b, c);
		// TODO Auto-generated constructor stub
	}
	
	
	public void printD() {
		System.out.println("PrintD of A class");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}


public class abstracttt{
	public static void main(String[] args) {
		A ab= new A(1,2,3);
		ab.printD();
		System.out.println("abstracttt class called");
	}
}