class Parent {
	static int x=10;
 Parent() {
	 x=20;
 System.out.println("Parent"+Parent.x);
 }
}

class Child extends Parent {
 Child() {
 System.out.println("Child");
 }
 Child(int x){
	 super();
	 System.out.println(x);
	 System.out.println(super.x);
 }
}

public class pgm3 {
public static void main(String[] args) {
	new Child();
	new Child(3);
}
}

