package controller;

public class ThreadVetor extends Thread {
	
	private int num;
	private int vetor[];
	
	public ThreadVetor(int num, int vetor[]) {
		this.num = num;
		this.vetor = vetor;			
	}
	
	@Override
	public void run() {
		vetorRunner();
	}
	
	private void vetorRunner() {
		if ((num % 2) == 0) {
			double startTime = System.nanoTime();
			for (int i = 0 ; i < vetor.length ; i++) {
				i++;
			}
			double endTime = System.nanoTime();
			double totalTime = endTime - startTime;
			totalTime = totalTime / Math.pow(10, 9);
			
			System.out.println("Par - " + totalTime);
		}
		else {
			double startTime = System.nanoTime();
			for (@SuppressWarnings("unused") int i : vetor) {
				i++;
			}
			double endTime = System.nanoTime();
			double totalTime = endTime - startTime;
			totalTime = totalTime / Math.pow(10, 9);
			
			System.out.println("Ímpar - " + totalTime);
		}
		
	}
}
