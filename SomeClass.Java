public class SomeClass {
	public static void main(String[] args) {
		someMethod(null);
	}
	public static void someMethod(Object o) {
		System.out.println("Object method Invoked");
	}
	public static void someMethod(String s) {
		System.out.println("String method Invoked");
	}
	public static void calculation(String[] arr){
   		System.out.println(0.1*3 == 0.3);
   		System.out.println(0.1*2 == 0.2);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		Integer num1 = 1000, num2 = 1000;  
       		System.out.println(num1 == num2);
       		Integer num3 = 20, num4 = 20;  
       		System.out.println(num3 == num4);
	}
} 
