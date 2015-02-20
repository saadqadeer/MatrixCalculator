import java.util.Scanner;
public class MatrixComputer {
	
	
	//Populating matrices
	public static void populatingmatrix(int matrix[][], int rows, int columns){
		
		Scanner in=new Scanner(System.in);
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
					
				matrix[i][j]=in.nextInt();
				//System.out.print(Beta[i][j]);
		}
}
		
}
//printing matrices
public static void printmatrix(int Matrix[][],int rows,int columns){
	//Matrix=new int [rows][columns];
	for(int r=0;r<rows;r++){
		for(int c=0;c<columns;c++){
		System.out.print(Matrix[r][c]);	
		}System.out.println();
		}
	

}

//addition of matrices
public static int[][] Addition(int[][] A,int r1,int c1, int[][] B,int r2,int c2) {
	//System.out.println("hello");
    int m = r1;
    int n = c1;
    if(r1!=r2 && c1!=c2){
    	System.out.println("ERROR! ");
    	
    }
    int[][] result = new int[m][n];
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
        	result[i][j] = A[i][j] + B[i][j];
    return result;
}
//Multiplication of matrices
public static int[][] Multiplication(int[][] A, int[][] B,int rowa,int cola,int rowb,int colb) {
    int mA = A.length;
    int nA = A[0].length;
    int mB = B.length;
    int nB = B[0].length;
    if (nA != mB) throw new RuntimeException("Order Violation ERROR!");
    int[][] result = new int[mA][nB];
    for (int i = 0; i < mA; i++)
        for (int j = 0; j < nB; j++)
            for (int k = 0; k < nA; k++)
                result[i][j] += (A[i][k] * B[k][j]);
    return result;
}

//subtraction of matrices
public static int[][] Subtraction(int[][] A,int rowa,int cola, int[][] B,int rowb,int colb) {
	int m = rowa;
    int n = cola;
    
    int[][] result = new int[m][n];
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
        	result[i][j] = A[i][j] - B[i][j];
    return result;
}


	public static void main(String[] args) {

		int rowsa;
		 int columa;
		 int rowsb;
		 int columb;
		 int rowsc;
		 int columc;
	
		// TODO Auto-generated method stub
		System.out.println("Enter the size of rows and columns for A");
		Scanner rowa = new Scanner(System.in);
		rowsa=rowa.nextInt();
		//rowa.close();
		
		Scanner cola = new Scanner(System.in);
		columa=cola.nextInt();
		//cola.close();
		
		int[][] MatrixA=new int[rowsa][columa];
		
		System.out.println("Enter the size of rows and columns for B");
		Scanner rowb = new Scanner(System.in);
		rowsb=rowb.nextInt();
		//rowb.close();
		Scanner colmb = new Scanner(System.in);
		columb=colmb.nextInt();
		//colmb.close();
		int[][] MatrixB=new int[rowsb][columb];
		
		
	/*	System.out.println("Enter the size of rows and columns for C");
		Scanner rowc = new Scanner(System.in);
		//rowc.close();
		rowsc=rowc.nextInt();
		Scanner colmc = new Scanner(System.in);
		columc=colmc.nextInt();
		//colmc.close();
		int[][] MatrixC=new int[rowsc][columc];*/
		
		System.out.println("Enter entries for matrix a");
		populatingmatrix(MatrixA, rowsa, columa);	
		printmatrix(MatrixA,rowsa,columa);
		
		System.out.println("Enter entries for matrix b");
		populatingmatrix(MatrixB, rowsb, columb);	
		printmatrix(MatrixB,rowsb,columb);
		
		/*System.out.println("Enter entries for matrix c");
		populatingmatrix(MatrixA, rowsc, columc);	
		printmatrix(MatrixA,rowsc,columc);
		*/
		
		int addresult[][]=Addition(MatrixA,rowsa,columa,MatrixB,rowsb,columb);
		printmatrix(addresult,2,2);
		
		int multiplyresult[][]=Multiplication(MatrixA,MatrixB, rowsa, columa, rowsb, columb);
		printmatrix(multiplyresult,2,2);
		
		int subtractresult[][]=Subtraction(MatrixA, rowsa, columa, MatrixB, rowsb, columb);
		printmatrix(subtractresult,2,2);
		

	}

}
