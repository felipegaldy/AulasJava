package br.com.generation.forr;

public class ExemploFor03 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int sobe=1, desce=10;sobe <= 10 && desce >= 1;sobe++, desce--) {
			System.out.println(sobe + " | " + desce);
			Thread.sleep(700);
	}

}
}