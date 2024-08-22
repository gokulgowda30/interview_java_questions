
public class pgm5 {
public static void main(String[] args) {
	int x = 10;
	// Runnable r = () -> System.out.println(x);//CTE
	 x = 20;
//	 r.run();
	 //Explanation
	/* Lambda Expression and Variable Capture:
		 In the lambda expression () -> System.out.println(x);, the variable x is captured from the enclosing scope.
		 For the lambda to capture a variable, that variable must be effectively final—meaning it cannot be modified after it is initialized.
		 Why the Code Fails:
		 After the lambda expression captures the variable x, you attempt to modify x with x = 20;.
		 This breaks the effectively final rule, causing a compile-time error. Java will not allow x to be modified after it has been captured by the lambda expression.
		 Compiler Error Message
		 The compiler will likely produce an error message similar to:

		 local variables referenced from a lambda expression must be final or effectively final*/
}
}
