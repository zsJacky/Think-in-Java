//: Ninth.java
// This is the Ninth exercise of chapter4
import java.util.Scanner;

public class Ninth {

	public static void main(String[] args) {
		int n;
        n = Integer.parseInt(args[0]);
		int num1 = 0; 
		int num2 = 1; 
		for(int i = 0; i <= n; i++) { 
			num1 += num2; 
			num2 = num1 - num2; 
		} 
		System.out.println("F(" + n + ") = " + num2); 
	}
}

