
public class FirstAssignment {

	public static void main(String[] args) {
		System.out.println("The below are basic maths method:");
		FirstAssignment obj1= new FirstAssignment();
		System.out.println("The Sum of two numbers are :" +obj1.add(5,6));
		System.out.println("The Subtraction of two numbers are :" +sub(5,6));
		System.out.println("The Multiplication of two numbers are : " + obj1.multi(5,6));
		System.out.println("The Division of two numbers are :" +division(6,6));

	}
	public int add(int a, int b) {
		int result=a+b;
		return result;
	}
	public static int sub(int a, int b) {
		int result= a-b;
		return result;
		
	}
	public float multi(int a, int b) {
	float result= a*b;
	return result;
}
	public static double division(int a, int b) {
		double result= a/b;
		return result;
		
	}
}
