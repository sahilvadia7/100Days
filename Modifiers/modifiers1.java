package Modifiers;

public class modifiers1 {
	
		final int a,b;
		
		
		modifiers1(int a,int b){
			this.a=a;
			this.b=b;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		modifiers1 mod = new modifiers1(5,10);
		System.out.println(mod.a+" "+mod.b);
		
//		cannot assign a value to a final variable
//		mod.a = 10; 
		
		
//		Static method called it static method don't required object to call method
		StaticMethodEx();
		
//		Cannot make a static reference to the non-static method StaticMethodE() from the type modifiers1
//		StaticMethodE();
		
//		call public method using call objet
		mod.StaticMethodE();
		
		
		
		
	}
	
	
	static void StaticMethodEx() {
		System.out.println("Static method called");
	}
	
	public void StaticMethodE() {
		System.out.print("Public method called");
	}

}
