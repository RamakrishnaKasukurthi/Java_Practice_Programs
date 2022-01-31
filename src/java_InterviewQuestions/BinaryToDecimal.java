package java_InterviewQuestions;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long num=10011011;
		double binary=binarytodecimal(num);
		System.out.println(binary);

	}
public static double binarytodecimal(long num) {
	double decimalnum=0;
	long remainder;
	int i=0;
	while (num!=0) {
		remainder=num%10;
		num=num/10;
		decimalnum=decimalnum+(remainder*Math.pow(2, i));
		//decimalnum +=remainder*Math.pow(2, i);
		++i;
		
	}
	
	return decimalnum;
	
}
	
}
