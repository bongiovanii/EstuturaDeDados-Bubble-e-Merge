package controller;

public class SortController {

	public SortController() {
		super();
	}
	
	public int[] bubbleSort(int[]vetor, int tamanho) {
		for(int i = 0; i < tamanho; i++) {
			for(int j = 0; j < tamanho - j - 1; j++) {
				if(vetor[j] > vetor[j+1]) {
					int aux =  vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
		
		return vetor;
	}
	
}
