//DO NOT CHANGE ANY CODE IN THIS FILE
//YOU DO NOT HAVE TO SUBMIT THIS FILE. IT IS MEANT FOR TESTING OF YOUR CODE
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

//Input format:
// N = Number of nodes
// E = Number of edges
// Mat = A matrix of dimension Ex3
// Each row of Mat consist of 3 integers. The first 2 integers denote the 2 nodes between which the
// undirected edge exists. The third integer denotes the weight of edge between these corresponding nodes
// S = source vertex to start Dijkstra Algorithm

public class DijkstraTest {

	@Test
	public void test1() {
		Dijkstra P = new Dijkstra();
		int[][] Mat = {  {1, 2, 9}, {1, 3, 6}, {1, 4, 5}, {1, 5, 3}, {3, 2, 2}, {3, 4, 4}  };
		int N = 5;
		int E = 6;
		int S = 1;
		int [][] ans = {{0, 1}, {8, 1}, {6, 1}, {5, 1}, {3, 1}};
		assertTrue(Arrays.deepEquals(P.Dijkstra_alg(N, E, Mat, S),ans));

	}
	
	@Test
	public void test2() {
		Dijkstra P = new Dijkstra();
		int[][] Mat = {  {1, 5, 3}, {1, 3, 2}, {2, 5, 3}, {4, 1, 1}, {4, 2, 1} };
		int N = 5;
		int E = 5;
		int S = 4;
		int [][] ans = {{1, 1}, {1, 1}, {3, 1}, {0, 1}, {4, 0}};
		assertTrue(Arrays.deepEquals(P.Dijkstra_alg(N, E, Mat, S),ans));

	}
	
	@Test
	public void test3() {
		Dijkstra P = new Dijkstra();
		int[][] Mat = {  {1, 2, 9}, {1, 3, 6}, {1, 4, 5}, {1, 5, 3}, {3, 2, 2}, {3, 4, 4}  };
		int N = 5;
		int E = 6;
		int S = 2;
		int [][] ans = {{8, 1}, {0, 1}, {2, 1}, {6, 1}, {11, 1}};
		assertTrue(Arrays.deepEquals(P.Dijkstra_alg(N, E, Mat, S),ans));

	}
	
	@Test
	public void test4() {
		Dijkstra P = new Dijkstra();
		int[][] Mat = {  {1, 2, 24}, {1, 4, 20}, {3, 1, 3}, {4, 3, 12} };
		int N = 4;
		int E = 4;
		int S = 1;
		int [][] ans = {{0, 1}, {24, 1}, {3, 1}, {15, 1}};
		assertTrue(Arrays.deepEquals(P.Dijkstra_alg(N, E, Mat, S),ans));

	}
	
	@Test
	public void test5() {
		Dijkstra P = new Dijkstra();
		int[][] Mat = {  {1, 2, 24}, {1, 4, 20}, {3, 1, 3}, {4, 3, 12}, {2, 4, 9} };
		int N = 4;
		int E = 5;
		int S = 1;
		int [][] ans = {{0, 1}, {24, 0}, {3, 1}, {15, 1}};
		assertTrue(Arrays.deepEquals(P.Dijkstra_alg(N, E, Mat, S),ans));

	}
	
	@Test
	public void test6() {
		Dijkstra P = new Dijkstra();
		int[][] Mat = {  {1, 2, 5}, {2, 3, 7} };
		int N = 3;
		int E = 2;
		int S = 3;
		int [][] ans = {{12, 1}, {7, 1}, {0, 1}};
		assertTrue(Arrays.deepEquals(P.Dijkstra_alg(N, E, Mat, S),ans));

	}
	
	@Test
	public void test7() {
		Dijkstra P = new Dijkstra();
		int[][] Mat = {  {1, 2, 4}, {2, 3, 1}, {1, 3, 5} };
		int N = 3;
		int E = 3;
		int S = 1;
		int [][] ans = {{0, 1}, {4, 1}, {5, 0}};
		assertTrue(Arrays.deepEquals(P.Dijkstra_alg(N, E, Mat, S),ans));

	}

}
