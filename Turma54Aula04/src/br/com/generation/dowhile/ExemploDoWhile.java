package br.com.generation.dowhile;

public class ExemploDoWhile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int contador=0;
		
		do {
			System.out.println("Olá Mundo!");
			contador++;
			Thread.sleep(300);
			
		}while(contador <= 10);

	}

}
