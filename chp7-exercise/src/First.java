//: First.java
// This is the first exercise of the chapter7.

class Simple {
	String s;
	Simple(String si) {
		s = si;  
	}  
	public String toString() {    
		return s;  
	}  
	public void setString(String sNew) {    
		s = sNew;  
	}
}

class Complex {  
	Simple simple;  
	String s;  
	public Complex(String si) {    
		s = si; // 'simple' not initialized  
	}  
	public void check() {    
		if(simple == null)      
			System.out.println("not initialized");    
		else      
			System.out.println("initialized");  
	} 
	private Simple lazy() {    
		if(simple == null) {      
			System.out.println("Creating Simple");      
			simple = new Simple(s);    }    
		return simple;  
	}  
	public Simple getSimple() { 
		return lazy(); 
	}  
	public String toString() {    
		return lazy().toString();  
	}  
	public void setSimple(String sNew) {    
		lazy().setString(sNew);  
		}
	}

public class First {  
	public static void main(String args[]) {    
		Complex complex = new Complex("Init String");    
		complex.check();    
		System.out.println(complex.getSimple());    
		complex.check(); 
		complex.setSimple("New String");
		System.out.println(complex); // toString() call      
		}	
}

