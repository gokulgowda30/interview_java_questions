
class A {
		 A() {
		 System.out.println("A()");
		 }
		 public static void hello() {
			 System.out.println("hello");
		 }
		}

		class B extends A {
			public static void hello() {
				 System.out.println("hello1");
			 }
		 B() {
			 super.hello();
			 hello();
		 System.out.println("B()");
		 }

		 B(int x) {
			 
		 this();
		 System.out.println("B(int)");
		 }
		}
		
public class pgm6 {
public static void main(String[] args) {
	//A a =new B();
	
	new B(10);
}
}
