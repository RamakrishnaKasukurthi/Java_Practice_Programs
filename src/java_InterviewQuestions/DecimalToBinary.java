package java_InterviewQuestions;

public class DecimalToBinary {

	public static void main(String[] args) {
	long binary=decimaltobinary(156);
	System.out.println(binary);
		

	}
public static long decimaltobinary(int n) {
	long binary=0;
	int reminder=1, i=1;
	
	while (n!=0) {
		reminder =n%2;
		n=n/2;
		binary +=reminder*i;
		i*=10;
	}
	return binary;
}
}
