package module_1;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[][]=new int[3][5];
		//System.out.println(x.length);//3 no. of Rows
//System.out.println(x[0].length);//5 No. of columns
x[0][0]=1;
x[0][1]=2;
x[0][2]=3;
x[0][3]=4;
x[0][4]=5;

x[1][0]=11;
x[1][1]=12;
x[1][2]=13;
x[1][3]=14;
x[1][4]=15;

x[2][0]=21;
x[2][1]=22;
x[2][2]=23;
x[2][3]=24;
x[2][4]=25;


for (int i = 0; i < x.length; i++) {
	for (int j = 0; j < x[i].length; j++) {
		System.out.print(x[i][j]+"  ");
			}
	System.out.println("");
}


	}

}
