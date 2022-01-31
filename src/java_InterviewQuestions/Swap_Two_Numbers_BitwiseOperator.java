package java_InterviewQuestions;

public class Swap_Two_Numbers_BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 20;
		System.out.println("Before Swap a:" + x);
		System.out.println("Before Swap b:" + y);

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;

		System.out.println("After Swap a:" + x);
		System.out.println("After Swap b:" + y);

	}

}
