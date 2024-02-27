package mat;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int M, N, i, j;
		
		System.out.println("Quantas linhas vai ter a matriz?");
		M = sc.nextInt();
		System.out.println("Quantas colunas vai ter a matriz?");
		N = sc.nextInt();
		
		int [][] mat = new int [M][N];
		
		for (i = 0; i < M; i++) {
			for (j =0; j< N; j++) {
				System.out.println("Elemento [" + i + "," + j + "]: ");
				
			}
		}
		
		System.out.println("\nMATRIZ:");
		for (i=0; i<M; i++) {
			for (j=0; j<N; j++) {
				System.out.println(mat[i][j] + "");
			}
			System.out.println();
		}
		sc.close();
	}

}




