package controller;

public class MergeController {

	public MergeController() {
		super();
	}
	
	public int[] mergeSort(int[]vetor, int inicio, int fim) {
		if(inicio < fim) {
			int meio = (inicio + fim) / 2;
			mergeSort(vetor,inicio,meio); //esquerda
			mergeSort(vetor,meio + 1, fim); // direita
			intercalaVetor(vetor,inicio,meio,fim);
		}
		
		return vetor;
	}

	private void intercalaVetor(int[] vetor, int inicio, int meio, int fim) {
		int[] novoVetor = new int[vetor.length];
		for(int i = inicio ; i <= fim; i++) {
			novoVetor[i]= vetor[i];
		}
		
		int esquerda = inicio;
		int direita = meio + 1;
		
		for(int count = inicio; count <= fim; count++) {
			if(esquerda > direita) {
				vetor[count] = novoVetor[direita];
				direita++;
			}
			else if(direita > fim) {
				vetor[count] = novoVetor[esquerda];
				esquerda++;
			}
			else if(novoVetor[esquerda] < novoVetor[direita]) {
				vetor[count] = novoVetor[esquerda];
				esquerda++;
			}
			else {
				vetor[count] = novoVetor[direita];
				direita++;
			}
		}
		
	}
}
