package view;
import java.util.concurrent.ThreadLocalRandom;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int vetor[] = new int[1000];
		for (int i = 0 ; i < vetor.length ; i++) {
			vetor[i] = ThreadLocalRandom.current().nextInt(0, 100+1);
		}
		
		Thread tv1 = new ThreadVetor(1, vetor);
		Thread tv2 = new ThreadVetor(2, vetor);
		tv1.start();
		tv2.start();
	}
}
