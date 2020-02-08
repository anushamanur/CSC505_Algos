//DO NOT CHANGE ANY EXISTING CODE IN THIS FILE
//DO NOT CHANGE THE NAMES OF ANY EXISTING FUNCTIONS
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.*;
public class Dijkstra {
	
	
	    public static int [][] Dijkstra_alg( int n, int e, int mat[][], int s)
	    {
	    	 //Write your code here to calculate shortest paths and usp values from source to all vertices
			 //This method will have four inputs (Please see testcase file)
			 //This method should return a two dimensional array as output (Please see testcase file) 
	
	}

	    public static void main(String []args) {
	
      		Result result = JUnitCore.runClasses(DijkstraTest.class);
		if(result.wasSuccessful())
			System.out.println("All test cases passed");
	
		for (Failure failure : result.getFailures()) {
         		System.out.println(failure.toString());
      		}
	}
}
