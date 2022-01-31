package module_1;

public class Character_Count_By_Ignoring_Space {

	public static void main(String[] args) {
		
		String s="Rama Krishna Kasukurthi";
		String[] word=s.split(" ");
		System.out.println("Tottal Characters: "+(word[0].length()+word[1].length()+word[2].length()));
		
	}

}
