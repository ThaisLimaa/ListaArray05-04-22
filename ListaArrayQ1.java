package Exercícios;

public class ListaArrayQ1 {
	public static void main(String[] args) {
					
		int [] A = {1, 0, 5, -2, -5, 7};
		int resultado, x;
		
		resultado = A[0] + A[1] + A[5];
		A [3]=100;
		
		for (x = 0; x < 6; x++)
		{
			System.out.println("\nPosição do Vetor A: " +A[x]);
		}
			System.out.println("\n\nResultado: " +resultado);						
	}

}
