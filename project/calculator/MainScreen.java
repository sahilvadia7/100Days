package project.calculator;

import java.util.Scanner;

public class MainScreen {
	
	private static int val1,val2,result;

	int getVal1() {
		return val1;
	}
	
	int setVal1(int val1) {
		return this.val1;
	}
	
	int getVal2() {
		return val2;
	}
	
	int setVal2(int val2) {
		return this.val2;
	}
	
	int getResult() {
		return result;
	}
	
	int setResult(int result) {
		return this.result;
	}
	
	
	
	int Addition(int val1,int val2) {
		return val1+val2;
	}
	int Multiplication(int val1,int val2) {
		return val1*val2;
	}
	int Division(int val1,int val2) {
		return val1/val2;
	}
	int Subtraction(int val1,int val2) {
		return val1-val2;
	}
	
	void PrintD(int result,int operation) {
		System.out.println();
		switch(operation) {
		case 1:
			System.out.println("Addition of "+val1 +" + "+ val2 +": "+result);
			break;
			
		case 2:
			System.out.println("Subtraction of "+val1+" - "+ val2+" : "+result);
			break;
		case 3:
			System.out.println("Multiplication of "+ val1+" * "+ val2+" : "+result);
			break;
		case 4:
			System.out.println("Division of "+val1+" / "+ val2+" : "+result);
			break;
		}

		
		
		
	}
	
	static void operation() {
	
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.print("Choose operation : ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter val1 : ");
		val1 = sc.nextInt();
		
		System.out.print("Enter val2 : ");
		val2 = sc.nextInt();
		
		operation();
		int operation = sc.nextInt();
		
		
		
		MainScreen ms = new MainScreen();
		ms.setVal1(val1);
		ms.setVal2(val2);
		
		
		switch(operation) {
			
		case 1 :
			result = ms.Addition(val1, val2);
			ms.PrintD(result,operation);
			break;
		case 2 :
			result = ms.Subtraction(val1, val2);
			ms.PrintD(result,operation);
			break;
		case 3 :
			result = ms.Multiplication(val1, val2);
			ms.PrintD(result,operation);
			break;
		case 4 :
			result = ms.Division(val1, val2);
			ms.PrintD(result,operation);
			break;
		}
		
		
		
	}

}
