import junit.framework.TestCase;


public class MatrixComputerTest extends TestCase {

	public void testAdd() {
		
		MatrixComputer Obj = null;
    	int matrixa[][]={
    			{1,2},
    			{3,4}
    			};
    	int matrixb[][]={
    			{1,2},
    			{3,4}
    			};
    	int matrixc[][]={
    			{0,0},
    			{0,0}};
    	int matrixd[][]={
    			{2,4},
    			{6,8}
    
    			};
    	
    	
    
        int result1[][]=Obj.Addition(matrixa,2,2,matrixb,2,2);
        int result2[][]=Obj.Addition(result1,2,2,matrixc,2,2);
        
        assertEquals(matrixd, result2);
		
		
		
		
		
	}

	
	public void testMultiply() {
		 MatrixComputer Obj = null;
		 int matrixa[][]={
	    			{1,2},
	    			{3,4}
	    			};
	    	int matrixb[][]={
	    			{0,0},
	    			{0,0}
	    			};
	    	int matrixc[][]={
	    			{0,0},
	    			{0,0}};
	
	 	 
	 	 int result[][]=Obj.Multiplication(matrixa,matrixb,2,2,2,2);
	 	 
	 	 assertEquals(matrixc, result);
	 	 
	       }
	//	fail("Not yet implemented");
	public void complexmul(){
		MatrixComputer Obj=null;
		 MatrixComputer a = null;
		 int matrixa[][]={
	    			{1,2},
	    			{3,4}
	    			};
			int matrixb[][]={
	    			{0,0},
	    			{0,0}};
	    	int matrixc[][]={
	    			{0,0},
	    			{0,0}};
	    	int matrixd[][]={
	    			{0,0},
	    			{0,0}};
	    	int matrixe[][]={
	    			{0,0},
	    			{0,0}};
	    
	    			
    	 
    	 
    	 int result[][]=Obj.Multiplication(matrixa,matrixb,2,2,2,2);
    	 int result2[][]=Obj.Addition(result,2,2,matrixd,2,2);
    	 
    	 assertEquals(matrixe, result2);
	}
	
	

}
