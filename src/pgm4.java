
public class pgm4 {
	public static void main(String[] args) {
		 System.out.println(testMethod());
		 
		 
		 }

		 public static int testMethod() {
		 int x = 10;
		 try {
		 return --x;
		 } finally {
		 return x + 1;
		 }
		 }
		 
		 
}
